
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.Proyecto;
import com.argentinaPrograma.Portfolio.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired  
    public ProyectoRepository proRepo;
    
    @Override
    public List<Proyecto> verProyectos(Integer id) {
        return proRepo.findByPersonaId(id); 
    }

    @Override
    public void crearProyecto(Proyecto proy) {
        proRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Integer id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Integer id) {
        return proRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proy) {
        proRepo.save(proy);
    }
    
}
