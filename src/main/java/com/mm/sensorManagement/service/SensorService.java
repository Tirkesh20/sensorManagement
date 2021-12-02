package com.mm.sensorManagement.service;

import com.mm.sensorManagement.model.Sensor;

import java.util.List;

public interface SensorService {

    void addSensor(Sensor sensor);

    List<Sensor> findAllSensors();

    void update(Sensor sensor);

    Sensor findSensorById(Long id);

    void deleteSensor(Long id);
}
