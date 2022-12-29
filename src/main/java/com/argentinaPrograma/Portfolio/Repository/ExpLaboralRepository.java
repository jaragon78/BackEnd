
package com.argentinaPrograma.Portfolio.Repository;

import com.argentinaPrograma.Portfolio.Model.ExpLaboral;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLaboralRepository extends JpaRepository <ExpLaboral, Integer>{
    public List<ExpLaboral> findByPersonaId(Integer id);
}
