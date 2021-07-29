package tkey.project.sensorManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tkey.project.sensorManagement.model.Sensor;

import java.util.Optional;

@Repository
public interface SensorRepository extends JpaRepository<Sensor,Long> {
    void deleteSensorById(Long id);

    Optional<Sensor> findSensorById(Long id);
}
