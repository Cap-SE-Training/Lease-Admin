package com.capsetrack.leaseadmin.models.vehicle;

import com.capsetrack.leaseadmin.models.vehicle.VehicleInfo.EngineInfo;
import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;

import java.util.ArrayList;

public class Tractor extends Vehicle {

    private String color;

    public Tractor(String license, Brand brand, int addition, double price, double catalogValue, EngineInfo engineInfo, String color) {
        super(license, brand, addition, price, catalogValue, engineInfo);
        this.color = color;
    }

    public Tractor(String id, String license, int mileage, String color) {
        super(id, license, mileage);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
