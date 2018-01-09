package com.capsetrack.leaseadmin.models.vehicle;

import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;

import java.util.ArrayList;

public class Motor extends Vehicle {
    private boolean sideCar;
    private boolean saddleBags;

    public Motor(String license, int mileage, Fuel fuelType, Brand brand, int addition, double price, Transmission transmission, ArrayList<String> options, double catalogValue, boolean sideCar, boolean saddleBags) {
        super(license, mileage, fuelType, brand, addition, price, transmission, options, catalogValue);
        this.sideCar = sideCar;
        this.saddleBags = saddleBags;
    }

    public boolean isSideCar() {
        return sideCar;
    }

    public boolean isSaddleBags() {
        return saddleBags;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }

    public void setSaddleBags(boolean saddleBags) {
        this.saddleBags = saddleBags;
    }
}
