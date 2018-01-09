package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.Employee;
import com.capsetrack.leaseadmin.models.LeaseCompany;
import com.capsetrack.leaseadmin.models.vehicle.*;

import java.io.IOException;

public class Main {

        public static void main(String[] args) throws IOException {
            Database database = new Database();
            LeaseCompany company = new LeaseCompany("Athlon");
            database.readVehicles(company);

            for(Vehicle vehicle: company.getVehicles()) {
                System.out.println(vehicle);
            }
    }
}
