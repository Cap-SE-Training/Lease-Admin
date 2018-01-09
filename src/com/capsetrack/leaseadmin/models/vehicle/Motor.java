package com.capsetrack.leaseadmin.models.vehicle;

import java.util.ArrayList;

public class Motor extends Vehicle {
    private boolean sideCar;
    private boolean saddleBags;

    public Motor(String license, int mileage, String fuelType, Brand brand, int addition, double price, String transmission, ArrayList<String> options, double catalogValue, boolean sideCar, boolean saddleBags) {
        super(license, mileage, fuelType, brand, addition, price, transmission, options, catalogValue);
        this.sideCar = sideCar;
        this.saddleBags = saddleBags;
    }

    public Motor(String id, String license, int mileage, boolean sideCar, boolean saddleBags){
        super(id, license, mileage);
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
