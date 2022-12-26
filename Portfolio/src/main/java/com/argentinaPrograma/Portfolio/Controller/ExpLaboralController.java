
package com.argentinaPrograma.Portfolio.Controller;

import com.argentinaPrograma.Portfolio.Model.ExpLaboral;
import com.argentinaPrograma.Portfolio.Service.IExpLaboralService;
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
public class ExpLaboralController {
    /*-------------------ExpLaboral-----------------------------------*/    
    @Autowired
    private IExpLaboralService expServ;
    
    @PostMapping ("/new/expLaboral")
    public void agregarExpLaboral (@RequestBody ExpLaboral exp){
        expServ.crearExpLaboral(exp);
    }
    
    @GetMapping ("ver/listaExpLaboral/{id}")
    @ResponseBody 
    public List<ExpLaboral> verListaExpLaboral(@PathVariable Integer id){
        return expServ.verExpLaboral(id);
    }
    
    @DeleteMapping ("/deleteExp/{id}")
    public void borrarExpLaboral(@PathVariable Integer id){
        expServ.borrarExpLaboral(id);
    }    

    @PutMapping ("/put/expLaboral")
    public void modificarExpLaboral (@RequestBody ExpLaboral exp){
        expServ.modificarExpLaboral(exp);
    }
}
