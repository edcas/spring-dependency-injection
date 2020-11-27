package com.eduardnow.di.attribute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    @Value("Kia")
    private String brand;

    @Value("2.0L 16V CVVT DUAL")
    private String model;

    public Engine() {
    }

    public Engine(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                '}';
    }
}
