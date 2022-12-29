
package com.argentinaPrograma.Portfolio.Controller;

import com.argentinaPrograma.Portfolio.Model.Persona;
import com.argentinaPrograma.Portfolio.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class PersonaController {

/*-------------------Persona-----------------------------------*/
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("get/persona/{id}")
    @ResponseBody 
    public Persona getPersona(@PathVariable Integer id){
        return persoServ.getPersona(id);
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable Integer id){
        persoServ.borrarPersona(id);
    }    

    @PutMapping ("/put/persona")
    public void modificarPersona (@RequestBody Persona pers){
        persoServ.modificarPersona(pers);
    }    
}
