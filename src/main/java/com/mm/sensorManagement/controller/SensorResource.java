package com.mm.sensorManagement.controller;


import com.mm.sensorManagement.model.Sensor;
import com.mm.sensorManagement.service.DefaultSensorService;
import javassist.tools.web.BadHttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@ComponentScan("./tkey.project.sensorManagement")
@RequestMapping("/sensor")
@Transactional
public class SensorResource {

    private final DefaultSensorService service;

    @Autowired
    public SensorResource(DefaultSensorService service) {
        this.service = service;
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Sensor>getAllSensors(){
        return service.findAllSensors();
    }

    @GetMapping("/find/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Sensor getSensorById(@PathVariable("id") Long id){
        return service.findSensorById(id);
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('admin')")
    @ResponseStatus(HttpStatus.CREATED)
    public void addSensor(@Valid @RequestBody Sensor sensor, BindingResult result) throws BadHttpRequest {
        if (result.hasErrors())
        {
            throw new BadHttpRequest();
        }
        service.addSensor(sensor);
    }

    @PutMapping("/update")
    @PreAuthorize("hasRole('admin')")
    @ResponseStatus(HttpStatus.OK)
    public void updateSensor(@RequestBody Sensor sensor){
        service.addSensor(sensor);}

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('admin')")
    @ResponseStatus(HttpStatus.OK)
    public void deleteSensor(@PathVariable("id")Long id){
         service.deleteSensor(id);
    }

}
