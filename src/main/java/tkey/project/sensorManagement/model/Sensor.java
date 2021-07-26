package tkey.project.sensorManagement.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Sensor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sensorModel;
    private Long startPoint;
    private Long endPoint;
    private String sensorType;
    private String modelUnit;
    private String locations;


    public Sensor(){

    }

    public Sensor(Long id, String sensorModel,
                  Long startPoint, Long endPoint,
                  String sensorType, String modelUnit,
                  String locations) {
        this.id = id;
        this.sensorModel = sensorModel;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.sensorType = sensorType;
        this.modelUnit = modelUnit;
        this.locations = locations;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
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

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String type) {
        this.sensorType = type;
    }

    public String getModelUnit() {
        return modelUnit;
    }

    public void setModelUnit(String unit) {
        this.modelUnit = unit;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String location) {
        this.locations = location;
    }


    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", model='" + sensorModel + '\'' +
                ", from=" + startPoint +
                ", to=" + endPoint +
                ", type='" + sensorType + '\'' +
                ", unit='" + modelUnit + '\'' +
                ", location='" + locations + '\'' +
                ", description='"  + '\'' +
                '}';
    }
}
