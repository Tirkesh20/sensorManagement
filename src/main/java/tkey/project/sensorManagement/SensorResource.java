package tkey.project.sensorManagement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tkey.project.sensorManagement.model.Sensor;
import tkey.project.sensorManagement.service.SensorService;

import java.util.List;

@RestController
@RequestMapping("/sensor")
public class SensorResource {

    private final SensorService service;

    @Autowired
    public SensorResource(SensorService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Sensor>> getAllSensors(){
        List<Sensor> list=service.findAllSensors();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Sensor> getSensorById(@PathVariable("id") Long id) throws Throwable {
    Sensor sensor=service.findSensorById(id);
    return new ResponseEntity<>(sensor,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Sensor> addSensor(@RequestBody Sensor sensor){
        Sensor newSensor= service.addSensor(sensor);
        return new ResponseEntity<>(newSensor,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Sensor> updateSensor(@RequestBody Sensor sensor){
        Sensor newSensor= service.addSensor(sensor);
        return new ResponseEntity<>(newSensor,HttpStatus.OK);
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<?> deleteSensor(@PathVariable("id")Long id){
         service.deleteSensor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
