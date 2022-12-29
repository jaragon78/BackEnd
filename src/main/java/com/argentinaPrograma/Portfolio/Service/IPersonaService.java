
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.Persona;
import java.util.List;

public interface IPersonaService {
    public Persona getPersona(Integer id);
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Integer id);
    
    //public Persona buscarPersona (Long id); 
    
    public void modificarPersona (Persona per);
}
