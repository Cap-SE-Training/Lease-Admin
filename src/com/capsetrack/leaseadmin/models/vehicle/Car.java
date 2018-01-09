package com.capsetrack.leaseadmin.models.vehicle;

import java.util.ArrayList;

public class Car extends Vehicle {
    public Car(String license, int mileage, String fuelType, Brand brand, int addition, double price, String transmission, ArrayList<String> options, double catalogValue) {
        super(license, mileage, fuelType, brand, addition, price, transmission, options, catalogValue);
    }

    public Car(String id, String license, int mileage){
        super(id, license, mileage);
    }
}
