package tkey.project.sensorManagement.validator;


import org.springframework.stereotype.Service;
import tkey.project.sensorManagement.model.Sensor;

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
