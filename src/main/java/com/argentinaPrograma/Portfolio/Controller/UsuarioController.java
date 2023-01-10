
package com.argentinaPrograma.Portfolio.Controller;

import com.argentinaPrograma.Portfolio.Model.Usuario;
import com.argentinaPrograma.Portfolio.Model.UsuarioRegistroDTO;
import com.argentinaPrograma.Portfolio.Repository.UsuarioRepository;
import com.argentinaPrograma.Portfolio.Service.IUsuarioService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin //(origins = "*", maxAge = 3600)
/* "https://hosting-argprg.web.app", maxAge = 3600)*/
@RestController
@RequiredArgsConstructor
public class UsuarioController {
/*-------------------Titulos----------------------------------*/ 
    @Autowired
    private IUsuarioService userServ;
    
    @PostMapping ("/new/user")
    public void agregarUsuario (@RequestBody Usuario user){
        userServ.crearUsuario(user);
    }
     
    @GetMapping ("get/username/{username}")
    @ResponseBody 
    public Optional<Usuario> getPersona(@PathVariable String username){
        return userServ.verPerfil(username);
    }
    
    @GetMapping ("/ver/listaUser")
    @ResponseBody 
    public List<Usuario> verListaUsuario(){
        return userServ.verUsuario();
    }

    @GetMapping ("/get/existeUser/{email}")
    @ResponseBody 
    public boolean existeUsuario(@PathVariable String email){
        return userServ.existeUsuario(email);
    }
    
    @DeleteMapping ("/deleteUser/{id}")
    public void borrarUsuario(@PathVariable Integer id){
        userServ.borrarUsuario(id);
    }    

    @PutMapping ("/put/user")
    public void modificarUsuario (@RequestBody Usuario user){
        userServ.modificarUsuario(user);
    }    

    @PostMapping ("/api/auth/register")
    //@CrossOrigin(origins = "http://localhost:4200")
    public void crearUsuario (@RequestBody Usuario user){
        userServ.crearUsuario(user);
    }
    
}