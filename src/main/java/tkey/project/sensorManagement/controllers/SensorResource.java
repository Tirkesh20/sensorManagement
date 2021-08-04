package tkey.project.sensorManagement.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import tkey.project.sensorManagement.model.Sensor;
import tkey.project.sensorManagement.service.SensorService;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@ComponentScan("./tkey.project.sensorManagement")
@RequestMapping("/sensor")
public class SensorResource {


    private final SensorService service;

    @Autowired
    public SensorResource(SensorService service) {
        this.service = service;
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
    }

    @GetMapping("/all")
    public ResponseEntity<List<Sensor>> getAllSensors(){
        List<Sensor> list=service.findAllSensors();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Sensor> getSensorById(@PathVariable("id") Long id){
    Sensor sensor=service.findSensorById(id);
    return new ResponseEntity<>(sensor,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Sensor> addSensor(@Valid @RequestBody Sensor sensor, BindingResult result){
        if (result.hasErrors())
        {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
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
