
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.ExpLaboral;
import com.argentinaPrograma.Portfolio.Repository.ExpLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpLaboralService implements IExpLaboralService{

    @Autowired  
    public ExpLaboralRepository expRepo;
    
    @Override
    public List<ExpLaboral> verExpLaboral(Integer id) {
        return expRepo.findByPersonaId(id);
    }

    @Override
    public void crearExpLaboral(ExpLaboral exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExpLaboral(Integer id) {
        expRepo.deleteById(id);
    }
    
    @Override
    public ExpLaboral buscarExpLaboral(Integer id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarExpLaboral(ExpLaboral exp) {
        expRepo.save(exp);
    }
    
}
