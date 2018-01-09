package com.capsetrack.leaseadmin.models.vehicle;

import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;

import java.util.ArrayList;

public class Truck extends Vehicle {

    private boolean dubbleLoader;

    public Truck(String license, int mileage, Fuel fuelType, Brand brand, int addition, double price, Transmission transmission, ArrayList<String> options, double catalogValue, boolean dubbleLoader) {
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
