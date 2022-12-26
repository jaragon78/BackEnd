
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.Usuario;
import com.argentinaPrograma.Portfolio.Service.PersonaService;
import com.argentinaPrograma.Portfolio.Model.Persona;
import com.argentinaPrograma.Portfolio.Model.Role;
import com.argentinaPrograma.Portfolio.Model.UsuarioRegistroDTO;
import com.argentinaPrograma.Portfolio.Repository.UsuarioRepository;
import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static net.bytebuddy.matcher.ElementMatchers.any;
import org.hibernate.annotations.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
/*
    @Autowired  
    public BCryptPasswordEncoder pswEncoder;
*/       
    @Autowired  
    public PersonaService perServ;
    
    @Autowired  
    public UsuarioRepository userRepo;
        
    @Override
    public List<Usuario> verUsuario() {
        return userRepo.findAll();    
    }

    @Override
    public Optional<Usuario> verPerfil(String username) {
        return userRepo.findByUsername(username);    
    }
    
    @Override
    public boolean existeUsuario (String email){
        Usuario usuario;
        usuario = userRepo.findByEmail(email);
        return !(usuario == null);       
    }
    
    @Override
    public void crearUsuario(Usuario user) {
          
        Persona persona = new Persona();
        persona.setNombre(user.getNombre());
        persona.setApellido(user.getApellido());
        persona.setCorreo(user.getEmail());
        persona.setUrl_fondo("https://static.licdn.com/sc/h/5q92mjc5c51bjlwaj3rs9aa82");
        persona.setUrl_foto("https://static.licdn.com/sc/h/244xhbkr7g40x6bsu4gi6q4ry");
        perServ.crearPersona(persona);
        user.setPersonaId(persona.getId_per());
        userRepo.save(user);    
    }

    @Override
    public void borrarUsuario(Integer id) {
        userRepo.deleteById(id);    
    }
/*
    @Override
    public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getEmail(),pswEncoder.encode(registroDTO.getPassword()),
                                      registroDTO.getPersonaId(),  
                                      registroDTO.getNombre(),registroDTO.getApellido(),
                                      Arrays.asList(new Rol("ROLE_USER")));
        return userRepo.save(usuario);
    }
*/
    @Override
    public void modificarUsuario(Usuario user) {
        userRepo.save(user);    
    }      

    @Override
    public Usuario loginUsuario (Usuario user){
        return userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword());
    }
    
    
/*
    @Override
    public UserDetails loadUserByUsername(String username){ // throw UsernameNotFoundException{
        Usuario usuario = userRepo.findByEmail(username);
        if(usuario == null){
            throw new UsernameNotFoundException("Usuario o Password inválidos");
        }
        return new User(usuario.getEmail(),usuario.getPassword(),mapearAutoridadesRoles(usuario.getRoles()));
    }
    
    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    
}
 */       
}
