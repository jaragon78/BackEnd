
package com.argentinaPrograma.Portfolio.Controller;

import com.argentinaPrograma.Portfolio.Model.Proyecto;
import com.argentinaPrograma.Portfolio.Service.IProyectoService;
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
public class ProyectoController {
  /*-------------------Proyecto-----------------------------------*/    
    @Autowired
    private IProyectoService proyServ;
    
    @PostMapping ("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyecto proy){
        proyServ.crearProyecto(proy);
    }
    
    @GetMapping ("ver/listaProyecto/{id}")
    @ResponseBody 
    public List<Proyecto> verListaProyectos(@PathVariable Integer id){
        return proyServ.verProyectos(id);
    }
    
    @DeleteMapping ("/deleteProy/{id}")
    public void borrarProyecto(@PathVariable Integer id){
        proyServ.borrarProyecto(id);
    }    

    @PutMapping ("/put/proyecto")
    public void modificarProyecto (@RequestBody Proyecto proy){
        proyServ.modificarProyecto(proy);
    }  
}
