package com.capsetrack.leaseadmin.models.vehicle.VehicleInfo;

import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;

import java.io.Serializable;

public class EngineInfo implements Serializable {
    private int mileage;
    private Fuel fuelType;
    private Transmission transmission;

    public EngineInfo(int mileage, Fuel fuelType, Transmission transmission) {
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.transmission = transmission;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}



