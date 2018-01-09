package com.capsetrack.leaseadmin;

import java.util.Objects;
import java.util.UUID;

public class Vehicle {
    private String id;
    private String license;
    private int mileage;
    private String fuelType;
    private Brand brand;
    private int addition;
    private double price; //demo purpose only we know we shouldn't use int here
    private String transmission;
    private ArrayList<String> options;
    private double catalogValue;


    public Vehicle() {
        this.id = UUID.randomUUID().toString();

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

    public String getTransmission() {return transmission;}

    public void setTransmission(String transmission) {this.transmission = transmission;}

    public double getCatalogValue() {return catalogValue;}

    public void setCatalogValue(double catalogValue) {this.catalogValue = catalogValue;}


    public String getFuelType() {return fuelType;}

    public void setFuelType(String fuelType) {this.fuelType = fuelType;}

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
}