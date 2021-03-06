package com.capsetrack.leaseadmin.models;

import com.capsetrack.leaseadmin.models.vehicle.Vehicle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class LeaseCompany implements Serializable {
    private String id;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<LeaseContract> contracts;
    private String name;

    public LeaseCompany(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.vehicles = new ArrayList<Vehicle>();
        this.contracts = new ArrayList<LeaseContract>();
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

    public ArrayList<Vehicle> listAvailableVehicles(){
        ArrayList<Vehicle> freeVehicles = new ArrayList<Vehicle>();
        for (Vehicle vehicle : this.vehicles) {
            if(vehicle.getIsFree()){
                freeVehicles.add(vehicle);
            }
            System.out.println(vehicle.toString());
        }

        return freeVehicles;
    }

    public Vehicle getFreeVehicle(String type){
        if(!vehicles.isEmpty()) {
            for (Vehicle vehicle : vehicles) {
                String name = vehicle.getClass().getSimpleName();
                if (name.equals(type) && vehicle.getIsFree()) {
                    System.out.println("Free vehicle of type " + type + " found!");
                    return vehicle;
                }
            }
        }

        System.out.println("No free vehicle of type " + type + " found!");
        return null;
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
