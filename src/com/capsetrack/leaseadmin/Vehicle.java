package com.capsetrack.leaseadmin;

import java.util.Objects;
import java.util.UUID;

public class Vehicle {
    private String id;
    private String license;
    private int mileage;

    public Vehicle() {
        this.id = UUID.randomUUID().toString();
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

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Vehicle)) {
            throw new Error("Object is no vehicle");
        }

        return this.id.equals(((Vehicle) object).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}