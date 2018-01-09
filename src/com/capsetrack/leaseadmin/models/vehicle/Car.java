package com.capsetrack.leaseadmin.models.vehicle;

import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;

import java.util.ArrayList;

public class Car extends Vehicle {
    public Car(String license, int mileage, Fuel fuelType, Brand brand, int addition, double price, Transmission transmission, ArrayList<String> options, double catalogValue) {
        super(license, mileage, fuelType, brand, addition, price, transmission, options, catalogValue);
    }

    public Car(String id, String license, int mileage){
        super(id, license, mileage);
    }
}
