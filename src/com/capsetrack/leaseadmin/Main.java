package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.Employee;
import com.capsetrack.leaseadmin.models.LeaseCompany;
import com.capsetrack.leaseadmin.models.vehicle.*;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;
import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Database database = new Database();
        LeaseCompany company = new LeaseCompany("Athlon");
        database.readVehicles(company);


        for (Vehicle vehicle : company.getVehicles()) {
            System.out.println(vehicle);
        }
    }
}


