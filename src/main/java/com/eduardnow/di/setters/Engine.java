package com.eduardnow.di.setters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    private String brand;

    private String model;

    public Engine() {
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

    @Value("2.0L 12V CVVT DUAL")
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
