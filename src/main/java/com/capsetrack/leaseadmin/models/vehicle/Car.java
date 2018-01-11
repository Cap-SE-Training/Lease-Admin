package com.capsetrack.leaseadmin.models.vehicle;

import com.capsetrack.leaseadmin.models.vehicle.VehicleInfo.EngineInfo;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;

public class Car extends Vehicle {

    public Car(String license, Brand brand, int addition, double price, double catalogValue, EngineInfo engineInfo) {
        super(license, brand, addition, price, catalogValue, engineInfo);
    }

    public Car(String id, String license, int mileage) {
        super(id, license, mileage);
    }

}
