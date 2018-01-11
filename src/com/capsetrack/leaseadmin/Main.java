package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.Employee;
import com.capsetrack.leaseadmin.models.LeaseCompany;
import com.capsetrack.leaseadmin.models.LeaseContract;
import com.capsetrack.leaseadmin.models.vehicle.*;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;
import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;

import java.awt.*;
import java.rmi.dgc.Lease;
import java.util.*;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Database database = new Database();
        LeaseCompany company = new LeaseCompany("Athlon");
        database.readVehicles(company);


        for (Vehicle vehicle : company.getVehicles()) {
            System.out.println(vehicle);
        }

        Employee employee = new Employee("Kees");

        LeaseContract contract = new LeaseContract(company.getVehicles().get(0),employee, 50);

//        contract.calculateProgress();

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                contract.calculateNewProgress();
            }
        }, 5000, 5000);
    }
}


