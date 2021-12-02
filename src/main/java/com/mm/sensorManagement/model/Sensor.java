package com.mm.sensorManagement.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.lang.annotation.Annotation;

import com.mm.sensorManagement.validator.SensorConstraint;


@Entity
@SensorConstraint
public class Sensor implements Serializable, Annotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 30)
    private String name;

    @NotBlank
    @Size(max = 15)
    private String sensorModel;

    private Long startPoint;
    private Long endPoint;

    @Enumerated(EnumType.STRING)
    @Column(name = "sensor_type", length = 15)
    private SensorType sensorType;

    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private ModelUnit modelUnit;

    @NotBlank
    @Size(max = 40)
    private String locations;

    @Size(max = 200)
    @Column(length = 210)
    private String description;

    public Sensor() {

    }

    public Sensor(Long id, String name, String sensorModel,
                  Long startPoint, Long endPoint,
                  SensorType sensorType, ModelUnit modelUnit,
                  String locations, String description) {
        this.id = id;
        this.name = name;
        this.sensorModel = sensorModel;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.sensorType = sensorType;
        this.modelUnit = modelUnit;
        this.locations = locations;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSensorModel() {
        return sensorModel;
    }

    public void setSensorModel(String model) {
        this.sensorModel = model;
    }

    public Long getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Long from) {
        this.startPoint = from;
    }

    public Long getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Long to) {
        this.endPoint = to;
    }

    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    public SensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorType type) {
        this.sensorType = type;
    }

    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    public ModelUnit getModelUnit() {
        return modelUnit;
    }

    public void setModelUnit(ModelUnit unit) {
        this.modelUnit = unit;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String location) {
        this.locations = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sensorModel='" + sensorModel + '\'' +
                ", startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                ", sensorType=" + sensorType +
                ", modelUnit=" + modelUnit +
                ", locations='" + locations + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
