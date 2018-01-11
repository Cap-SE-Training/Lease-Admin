package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.LeaseCompany;
import com.capsetrack.leaseadmin.models.vehicle.*;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
//        Main.saveFixtures();

        ArrayList vehicles = Database.load("vehicles.tmp");
        System.out.println("something");
        //
//        LeaseCompany company = new LeaseCompany("Athlon");
//        ArrayList vehicles = Database.load("vehicles.tmp");
//        for (Vehicle vehicle : (ArrayList<Vehicle>) vehicles) {
//            company.addVehicle(vehicle);
//        }
//
//        company.listVehicles();

//
//        for (Vehicle vehicle : company.getVehicles()) {
//            System.out.println(vehicle);
//        }
    }

    private static void saveFixtures() throws IOException {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car("00-AA-12", 100));
        vehicles.add(new Car("00-AA-12", 100));
        vehicles.add(new Car("00-AA-12", 100));
        vehicles.add(new Car("00-AA-12", 100));
        vehicles.add(new Car("00-AA-12", 100));
        vehicles.add(new Motor("00-AA-12", 100, true, true));
        Car car = new Car("00-AA-12", 100);
        car.setBrand(Brand.Ford);
        vehicles.add(car);
        Database.save("vehicles.tmp", vehicles);
    }
}


