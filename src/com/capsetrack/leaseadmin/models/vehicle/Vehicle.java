package com.capsetrack.leaseadmin.models.vehicle;

import com.capsetrack.leaseadmin.models.vehicle.VehicleInfo.EngineInfo;
import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;
import com.capsetrack.leaseadmin.models.vehicle.interfaces.iDrive;


import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public abstract class Vehicle implements iDrive {
    private final String id;
    private String license;
    private Brand brand;
    private int addition;
    private double price; //demo purpose only we know we shouldn't use double here
    private Transmission transmission;
    private ArrayList<String> options;
    private double catalogValue;
    private EngineInfo engineInfo;
    private boolean isFree;

    public Vehicle(String license, Brand brand, int addition, double price, double catalogValue, EngineInfo engineInfo){
        this.license = license;
        this.brand = brand;
        this.addition = addition;
        this.price = price;
        this.catalogValue = catalogValue;
        this.id = UUID.randomUUID().toString();
        this.engineInfo = engineInfo;
        this.isFree = true;
    }

    public Vehicle(String id, String license) {
        this.id = id;
        this.license = license;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getAddition() {return addition;}

    public void setAddition(int addition) {this.addition = addition;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public double getCatalogValue() {return catalogValue;}

    public void setCatalogValue(double catalogValue) {this.catalogValue = catalogValue;}

    public void setIsFree(boolean isFree){
        this.isFree = isFree;
    }

    public boolean getIsFree(){
        return this.isFree;
    }

    public boolean equals(Vehicle vehicle) {
        return this.id.equals(vehicle.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return "Vehicle " + this.id + ": mileage - " + this.engineInfo.getMileage() + ", license - " + this.license;
    }
}