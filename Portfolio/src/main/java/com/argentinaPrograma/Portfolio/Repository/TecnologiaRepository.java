
package com.argentinaPrograma.Portfolio.Repository;

import com.argentinaPrograma.Portfolio.Model.Tecnologia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository <Tecnologia, Integer>{
    public List<Tecnologia> findByPersonaId(Integer id);
}
