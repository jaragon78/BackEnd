
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.Educacion;
import com.argentinaPrograma.Portfolio.Model.Persona;
import com.argentinaPrograma.Portfolio.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired  
    public EducacionRepository eduRepo;
        
    @Override
    public List<Educacion> verListaEducacion(Integer id) {
        return eduRepo.findByPersonaId(id);
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Integer id) {
        eduRepo.deleteById(id);
    }
    
    @Override
    public Educacion buscarEducacion(Integer id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion edu) {
      eduRepo.save(edu);
    }
    
}
