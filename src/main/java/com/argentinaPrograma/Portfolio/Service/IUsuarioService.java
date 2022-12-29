
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.Usuario;
import com.argentinaPrograma.Portfolio.Model.UsuarioRegistroDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUsuarioService { //extends UserDetailsService"
    
    public List <Usuario> verUsuario();
    
    public void crearUsuario (Usuario user);
    
    public void borrarUsuario (Integer id);
    
  //  public Usuario guardarUsuario (UsuarioRegistroDTO registroDTO); 
    
    public void modificarUsuario (Usuario user);
    
    public Usuario loginUsuario (Usuario user);

    public boolean existeUsuario (String email);
    
    public Optional<Usuario> verPerfil(String username);
}
