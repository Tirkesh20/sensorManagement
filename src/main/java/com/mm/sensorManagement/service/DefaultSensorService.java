package com.mm.sensorManagement.service;

import com.mm.sensorManagement.model.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mm.sensorManagement.exception.ObjectNotFoundException;
import com.mm.sensorManagement.repo.SensorRepository;

import java.util.List;

@Service
public class DefaultSensorService implements SensorService{

    private final SensorRepository sensorRepository;

    @Autowired
    public DefaultSensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public void addSensor(Sensor sensor){
        sensorRepository.save(sensor);
    }

    public List<Sensor> findAllSensors(){
        return sensorRepository.findAll();
    }

    public void update(Sensor sensor){
        sensorRepository.save(sensor);
    }

    public Sensor findSensorById(Long id) {
        return sensorRepository.
                findSensorById(id).
                orElseThrow(()-> new ObjectNotFoundException("No sensor found with "+id+"this id"));
    }

    public void deleteSensor(Long id){
        sensorRepository.deleteSensorById(id);
    }


}
