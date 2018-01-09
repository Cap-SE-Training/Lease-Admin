package com.capsetrack.leaseadmin.models.vehicle;

import java.util.ArrayList;
import java.util.UUID;

public class LeaseCompany {
    private String id;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<LeaseContract> contracts;
    private String name;

    public LeaseCompany(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public void addVehicle(Vehicle vehicle) {
        if (!this.vehicles.contains(vehicle)) {
            this.vehicles.add(vehicle);
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        if (this.vehicles.contains(vehicle)) {
            this.vehicles.remove(vehicle);
        }
    }

    public void updateVehicle(String vehicleId, Vehicle vehicle) {

    }

    public void listContracts() {
        for (LeaseContract contract : this.contracts) {
            System.out.println(contract.toString());
        }
    }

    public void listVehicles() {
        for (Vehicle vehicle : this.vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    public void addContract(LeaseContract contract) {
        if (!this.contracts.contains(contract)) {
            this.contracts.add(contract);
        }
    }

    public void removeContract(LeaseContract contract) {
        if (this.contracts.contains(contract)) {
            this.contracts.remove(contract);
        }
    }

    public String getId() {
        return id;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<LeaseContract> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<LeaseContract> contracts) {
        this.contracts = contracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
