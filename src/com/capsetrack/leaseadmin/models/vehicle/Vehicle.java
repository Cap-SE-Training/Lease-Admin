package com.capsetrack.leaseadmin.models.vehicle;

import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;


import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public abstract class Vehicle {
    private final String id;
    private String license;
    private int mileage;
    private Fuel fuelType;
    private Brand brand;
    private int addition;
    private double price; //demo purpose only we know we shouldn't use int here
    private Transmission transmission;
    private ArrayList<String> options;
    private double catalogValue;

    public Vehicle(String license, int mileage, Fuel fuelType, Brand brand, int addition, double price, Transmission transmission, ArrayList<String> options, double catalogValue) {
        this.license = license;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.brand = brand;
        this.addition = addition;
        this.price = price;
        this.transmission = transmission;
        this.options = options;
        this.catalogValue = catalogValue;
        this.id = UUID.randomUUID().toString();
    }

    public Vehicle(String id, String license, int mileage) {
        this.id = id;
        this.license = license;
        this.mileage = mileage;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
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

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getAddition() {return addition;}

    public void setAddition(int addition) {this.addition = addition;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

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

    public ArrayList<String> getOptions() {
        return options;
    }

    public double getCatalogValue() {return catalogValue;}

    public void setCatalogValue(double catalogValue) {this.catalogValue = catalogValue;}


    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Vehicle)) {
            throw new Error("Object is no vehicle");
        }

        return this.id.equals(((Vehicle) object).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return "Vehicle " + this.id + ": mileage - " + this.mileage + ", license - " + this.license;
    }
}