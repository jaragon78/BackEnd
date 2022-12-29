
package com.argentinaPrograma.Portfolio.Service;

import com.argentinaPrograma.Portfolio.Model.Persona;
import com.argentinaPrograma.Portfolio.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired  
    public PersonaRepository persoRepo;
    
    @Override
    public Persona getPersona(Integer id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Integer id) {
        persoRepo.deleteById(id);
    }

    //@Override
    //public Persona buscarPersona(Long id) {
    //   return persoRepo.findById(id).orElse(null);
    //}   

    @Override
    public void modificarPersona(Persona per) {
        persoRepo.save(per);
    }    
}