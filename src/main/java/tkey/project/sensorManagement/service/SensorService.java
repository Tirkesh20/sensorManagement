package tkey.project.sensorManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tkey.project.sensorManagement.exceptions.ObjectNotFoundException;
import tkey.project.sensorManagement.model.Sensor;
import tkey.project.sensorManagement.repo.SensorRepository;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    @Autowired
    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public Sensor addSensor(Sensor sensor){
        return sensorRepository.save(sensor);
    }

    public List<Sensor> findAllSensors(){
        return sensorRepository.findAll();
    }

    public Sensor update(Sensor sensor){
        return sensorRepository.save(sensor);
    }

    public Sensor findSensorById(Long id) {
        return sensorRepository.findSensorById(id).orElseThrow(()->new ObjectNotFoundException("No sensor found with "+id+"this id"));
    }

    public void deleteSensor(Long id){
        sensorRepository.deleteSensorById(id);
    }


}
