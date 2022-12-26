
package com.argentinaPrograma.Portfolio.Controller;

import com.argentinaPrograma.Portfolio.Model.Educacion;
import com.argentinaPrograma.Portfolio.Service.IEducacionService;
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
public class EducacionController {
  /*-------------------Educacion-----------------------------------*/    
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("ver/listaEducacion/{id}")
    @ResponseBody 
    public List<Educacion> verListaEducacion(@PathVariable Integer id){
        return eduServ.verListaEducacion(id);
    }
    
    @DeleteMapping ("/deleteEdu/{id}")
    public void borrarEducacion(@PathVariable Integer id){
        eduServ.borrarEducacion(id);
    }    

    @PutMapping ("/put/educacion")
    public void modificarEducacion (@RequestBody Educacion edu){
        eduServ.modificarEducacion(edu);
    }    
}
