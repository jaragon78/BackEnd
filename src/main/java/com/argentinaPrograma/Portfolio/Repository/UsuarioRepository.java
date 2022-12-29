
package com.argentinaPrograma.Portfolio.Repository;

import com.argentinaPrograma.Portfolio.Model.Usuario;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
    public Usuario findByEmailAndPassword(String email, String password);
    public Usuario findByEmail(String email);
    Boolean existsByEmail(String email);
    Optional<Usuario> findByUsername(String username);
    Boolean existsByUsername(String username);
}
