package com.mm.sensorManagement.repo;

import com.mm.sensorManagement.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SensorRepository extends JpaRepository<Sensor,Long> {
    void deleteSensorById(Long id);
    Optional<Sensor> findSensorById(Long id);
}
