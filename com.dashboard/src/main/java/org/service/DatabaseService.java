package org.service;


import jakarta.enterprise.context.ApplicationScoped;
import org.model.SensorData;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class DatabaseService {
    private final List<SensorData> sensors = new ArrayList<>();

    public DatabaseService() {
        sensors.add(new SensorData("Temperature", 22.5f, "°C"));
        sensors.add(new SensorData("Humidity", 45.0f, "%"));
        sensors.add(new SensorData("Light", 300.0f, "lux"));
    }

    public List<SensorData> getAllSensors() {
        return sensors;
    }

    public void updateSensor(String name, float value) {
        sensors.stream()
                .filter(sensor -> sensor.getName().equalsIgnoreCase(name))
                .findFirst()
                .ifPresent(sensor -> sensor.setValue(value));
    }
}
