package com.mm.sensorManagement.validator;


import com.mm.sensorManagement.model.Sensor;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


@Service
public class SensorValidator implements ConstraintValidator<SensorConstraint, Object> {

    @Override
    public void initialize(SensorConstraint sensorConstraint) {
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        Sensor sensor=(Sensor) o;
        return sensor.getStartPoint() < sensor.getEndPoint();
    }
}
