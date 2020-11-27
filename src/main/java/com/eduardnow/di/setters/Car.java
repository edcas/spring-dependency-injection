package com.eduardnow.di.setters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private String brand;

    private String model;

    private Engine engine;

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    @Value("Kia")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    @Value("Sportage")
    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", engine=" + engine +
                '}';
    }
}
