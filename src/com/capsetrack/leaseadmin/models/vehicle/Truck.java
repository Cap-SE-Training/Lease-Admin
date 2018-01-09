package com.capsetrack.leaseadmin.models.vehicle;

import java.util.ArrayList;

public class Truck extends Vehicle {

    private boolean doubleLoader;

    public Truck(String license, int mileage, String fuelType, Brand brand, int addition, double price, String transmission, ArrayList<String> options, double catalogValue, boolean dubbleLoader) {
        super(license, mileage, fuelType, brand, addition, price, transmission, options, catalogValue);
        this.doubleLoader = dubbleLoader;
    }

    public Truck(String id, String license, int mileage, boolean doubleLoader){
        super(id, license, mileage);
        this.doubleLoader = doubleLoader;
    }
    public boolean isDoubleLoader() {
        return doubleLoader;
    }

    public void setDoubleLoader(boolean doubleLoader) {
        this.doubleLoader = doubleLoader;
    }
}
