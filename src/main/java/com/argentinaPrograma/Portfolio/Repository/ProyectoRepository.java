
package com.argentinaPrograma.Portfolio.Repository;

import com.argentinaPrograma.Portfolio.Model.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository  extends JpaRepository <Proyecto, Integer>{
    public List<Proyecto> findByPersonaId(Integer id);
}
