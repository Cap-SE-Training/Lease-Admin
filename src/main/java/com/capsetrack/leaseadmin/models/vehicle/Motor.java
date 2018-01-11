package com.capsetrack.leaseadmin.models.vehicle;

import com.capsetrack.leaseadmin.models.vehicle.VehicleInfo.EngineInfo;
import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;

import java.util.ArrayList;

public class Motor extends Vehicle {
    private boolean sideCar;
    private boolean saddleBags;


    public Motor(String license, Brand brand, int addition, double price, double catalogValue, EngineInfo engineInfo, boolean sideCar, boolean saddleBags) {
        super(license, brand, addition, price, catalogValue, engineInfo);
        this.sideCar = sideCar;
        this.saddleBags = saddleBags;
    }

    public Motor(String id, String license, int mileage, boolean sideCar, boolean saddleBags) {
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
