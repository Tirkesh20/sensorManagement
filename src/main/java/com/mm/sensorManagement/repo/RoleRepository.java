package com.mm.sensorManagement.repo;

import com.mm.sensorManagement.model.ERole;
import com.mm.sensorManagement.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
