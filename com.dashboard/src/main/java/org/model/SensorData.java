package org.model;

public class SensorData {
    private String name;
    private float value;
    private String unit;

    public SensorData() {}

    public SensorData(String name, float value, String unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return name + ": " + value + " " + unit;
    }
}
