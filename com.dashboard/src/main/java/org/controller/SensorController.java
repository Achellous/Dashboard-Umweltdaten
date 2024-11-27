package org.controller;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.model.SensorData;
import org.service.DatabaseService;

import java.util.List;

@ApplicationScoped
public class SensorController {

    @Inject
    DatabaseService databaseService;

    public List<SensorData> getSensors() {
        return databaseService.getAllSensors();
    }

    public void updateSensor(String name, float value) {
        databaseService.updateSensor(name, value);
    }
}

