
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List <Proyecto> verProyectos(Integer id);
    
    public void crearProyecto (Proyecto proy);
    
    public void borrarProyecto (Integer id);
    
    public Proyecto buscarProyecto (Integer id); 
    
    public void modificarProyecto (Proyecto proy); 
}
