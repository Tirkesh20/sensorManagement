package tkey.project.sensorManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tkey.project.sensorManagement.model.ERole;
import tkey.project.sensorManagement.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(ERole name);
}
