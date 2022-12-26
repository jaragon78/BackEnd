
package com.argentinaPrograma.Portfolio.Repository;

import com.argentinaPrograma.Portfolio.Model.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Integer>{
    public List<Educacion> findByPersonaId(Integer id);
}
