package com.capsetrack.leaseadmin.models.vehicle;

import java.util.ArrayList;

public class Tractor extends Vehicle {

    private String color;

    public Tractor(String license, int mileage, String fuelType, Brand brand, int addition, double price, String transmission, ArrayList<String> options, double catalogValue, String color) {
        super(license, mileage, fuelType, brand, addition, price, transmission, options, catalogValue);
        this.color = color;
    }

    public Tractor(String id, String license, int mileage, String color){
        super(id, license, mileage);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
