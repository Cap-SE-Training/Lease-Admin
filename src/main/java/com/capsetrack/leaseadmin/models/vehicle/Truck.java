package com.capsetrack.leaseadmin.models.vehicle;

import com.capsetrack.leaseadmin.models.vehicle.VehicleInfo.EngineInfo;
import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;

import java.util.ArrayList;

public class Truck extends Vehicle {

    private boolean doubleLoader;

    public Truck(String license, Brand brand, int addition, double price, double catalogValue, EngineInfo engineInfo, boolean doubleLoader) {
        super(license, brand, addition, price, catalogValue, engineInfo);
        this.doubleLoader = doubleLoader;
    }

    public Truck(String id, String license, int mileage, boolean doubleLoader) {
        super(id, license, mileage);
        this.doubleLoader = doubleLoader;
    }

    public boolean isDoubleLoader() {
        return doubleLoader;
    }

    public void setDoubleLoader(boolean doubleLoader) {
        this.doubleLoader = doubleLoader;
    }

    @Override
    public void drive(Vehicle vehicle, int distance) {
        vehicle.getEngineInfo().setMileage(vehicle.getEngineInfo().getMileage()+distance);
    }
}
