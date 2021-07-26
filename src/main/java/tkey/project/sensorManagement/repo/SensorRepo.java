package tkey.project.sensorManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tkey.project.sensorManagement.model.Sensor;

import java.util.Optional;

public interface SensorRepo extends JpaRepository<Sensor,Long> {
    void deleteSensorById(Long id);

    Optional<Sensor> findSensorById(Long id);
}
