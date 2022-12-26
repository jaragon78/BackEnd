
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.Educacion;
import com.argentinaPrograma.Portfolio.Model.Persona;
import java.util.List;

public interface IEducacionService {
    public List <Educacion> verListaEducacion(Integer id);
    
    public void crearEducacion (Educacion edu);
    
    public void borrarEducacion (Integer id);
    
    public Educacion buscarEducacion (Integer id); 
    
    public void modificarEducacion (Educacion edu);  
}
