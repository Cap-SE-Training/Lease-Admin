package com.capsetrack.leaseadmin.models.vehicle;

import java.util.ArrayList;

public class Truck extends Vehicle {

    private boolean dubbleLoader;

    public Truck(String license, int mileage, String fuelType, Brand brand, int addition, double price, String transmission, ArrayList<String> options, double catalogValue, boolean dubbleLoader) {
        super(license, mileage, fuelType, brand, addition, price, transmission, options, catalogValue);
        this.dubbleLoader = dubbleLoader;
    }

    public boolean isDubbleLoader() {
        return dubbleLoader;
    }

    public void setDubbleLoader(boolean dubbleLoader) {
        this.dubbleLoader = dubbleLoader;
    }
}
