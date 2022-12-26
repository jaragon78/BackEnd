
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.ExpLaboral;
import java.util.List;

public interface IExpLaboralService {
    public List <ExpLaboral> verExpLaboral(Integer id);
    
    public void crearExpLaboral (ExpLaboral exp);
    
    public void borrarExpLaboral (Integer id);
    
    public ExpLaboral buscarExpLaboral (Integer id); 
    
    public void modificarExpLaboral (ExpLaboral exp); 
}
