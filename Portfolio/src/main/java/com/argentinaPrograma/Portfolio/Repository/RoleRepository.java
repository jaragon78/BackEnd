package com.argentinaPrograma.Portfolio.Repository;

import com.argentinaPrograma.Portfolio.Model.ERole;
import com.argentinaPrograma.Portfolio.Model.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>{
     Optional<Role> findByName(ERole name); 
}
