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

public class Main {

        public static void main(String[] args) {
            Employee employee = new Employee("Niels Opdam");
            Employee employee1 = new Employee("Sascha Van den Hurk");
            Employee employee2 = new Employee("Jimmy Knoot");
            Employee employee3 = new Employee("Ian Nelissen");
            Employee employee4 = new Employee("Alexander Van 't Hof");
            Employee employee5 = new Employee("Mustafa Afkir");

            LeaseCompany athlon = new LeaseCompany("Athlon");
            LeaseCompany thatOtherCompany = new LeaseCompany("thatOtherCompany");

            ArrayList<String> options = new ArrayList<String>();
            options.add("Lichtgevend dak");
            options.add("Stoelverwarming");

            Vehicle vehicle = new Car("LM-SX-13", 3000, Fuel.Benzine, Brand.Ford, 14, 10.00, Transmission.Automatic, options, 15.00);
            Vehicle vehicle2 = new Car("LM-SX-14", 3001, Fuel.Diesel, Brand.Toyota, 15, 11.00, Transmission.Manual, options, 16.00);
            Vehicle vehicle3 = new Motor("LM-SX-15", 3002, Fuel.Benzine, Brand.Volkswagen, 16, 12.00, Transmission.Automatic, options, 17.00, true, true);
            Vehicle vehicle4 = new Truck("LM-SX-16", 3003, Fuel.Hybrid, Brand.Volvo, 17, 13.00, Transmission.Manual, options, 18.00, true);
            Vehicle vehicle5 = new Tractor("LM-SX-177", 3004, Fuel.Electric, Brand.Ford, 18, 14.00, Transmission.Automatic, options, 19.00, "Green");

        }
    }


