
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    public List <Tecnologia> verTecnologia(Integer Id);
    
    public void crearTecnologia (Tecnologia tecno);
    
    public void borrarTecnologia (Integer id);
    
    public Tecnologia buscarTecnologia (Integer id); 
    
    public void modificarTecnologia (Tecnologia tecno); 
}
