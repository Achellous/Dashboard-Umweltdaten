package org.resource;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.controller.SensorController;
import org.model.SensorData;

import java.util.List;

@Path("/sensors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SensorResource {

    @Inject
    SensorController sensorController;

    @GET
    public List<SensorData> getAllSensors() {
        return sensorController.getSensors();
    }

    @PUT
    @Path("/{name}")
    public void updateSensor(@PathParam("name") String name, @QueryParam("value") float value) {
        sensorController.updateSensor(name, value);
    }
}

