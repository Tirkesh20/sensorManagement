package tkey.project.sensorManagement.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = SensorValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface SensorConstraint {
    String message() default "Start point can t be bigger than end point";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}