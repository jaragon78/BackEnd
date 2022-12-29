
package com.argentinaPrograma.Portfolio.Controller;

import com.argentinaPrograma.Portfolio.Model.Tecnologia;
import com.argentinaPrograma.Portfolio.Service.ITecnologiaService;
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
public class TecnologiaController {
  /*-------------------Tecnologias-----------------------------------*/    
    @Autowired
    private ITecnologiaService tecnoServ;
    
    @PostMapping ("/new/tecnologia")
    public void agregarTecnologia (@RequestBody Tecnologia tecno){
        tecnoServ.crearTecnologia(tecno);
    }
    
    @GetMapping ("ver/listaTecnologias/{id}")
    @ResponseBody 
    public List<Tecnologia> verListaTecnologias(@PathVariable Integer id){
        return tecnoServ.verTecnologia(id);
    }
    
    @DeleteMapping ("/deleteTecno/{id}")
    public void borrarTecnologia(@PathVariable Integer id){
        tecnoServ.borrarTecnologia(id);
    }    

    @PutMapping ("/put/tecnologia")
    public void modificarTecnologia (@RequestBody Tecnologia tecno){
        tecnoServ.modificarTecnologia(tecno);
    }   
}
