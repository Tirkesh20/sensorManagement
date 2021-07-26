package tkey.project.sensorManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tkey.project.sensorManagement.exceptions.ObjectNotFoundException;
import tkey.project.sensorManagement.model.Sensor;
import tkey.project.sensorManagement.repo.SensorRepo;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepo sensorRepo;

    @Autowired
    public SensorService(SensorRepo sensorRepo) {
        this.sensorRepo = sensorRepo;
    }

    public Sensor addSensor(Sensor sensor){
        return sensorRepo.save(sensor);
    }

    public List<Sensor> findAllSensors(){
        return sensorRepo.findAll();
    }

    public Sensor update(Sensor sensor){
        return sensorRepo.save(sensor);
    }

    public Sensor findSensorById(Long id) {
        return sensorRepo.findSensorById(id).orElseThrow(()->new ObjectNotFoundException("No sensor found with "+id+"this id"));
    }

    public void deleteSensor(Long id){
        sensorRepo.deleteSensorById(id);
    }


}
