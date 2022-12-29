
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.Tecnologia;
import com.argentinaPrograma.Portfolio.Repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService {

    @Autowired  
    public TecnologiaRepository tecnoRepo;
    
    @Override
    public List<Tecnologia> verTecnologia(Integer id) {
        return tecnoRepo.findByPersonaId(id); 
    }

    @Override
    public void crearTecnologia(Tecnologia tecno) {
        tecnoRepo.save(tecno);
    }

    @Override
    public void borrarTecnologia(Integer id) {
        tecnoRepo.deleteById(id);   
    }

    @Override
    public Tecnologia buscarTecnologia(Integer id) {
        return tecnoRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarTecnologia(Tecnologia tecno) {
        tecnoRepo.save(tecno);
    }
    
}
