package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.Employee;
import com.capsetrack.leaseadmin.models.LeaseCompany;
import com.capsetrack.leaseadmin.models.vehicle.*;

import java.io.*;
import java.util.Scanner;

public class Database {

    public void readVehicles(LeaseCompany company) throws IOException {

        Scanner input = new Scanner(new File("src/com/capsetrack/leaseadmin/data/" + company.getName() + "-vehicles.txt"));

        while(input.hasNext()){
            String type = input.next();
            String id = input.next();
            int mileage = input.nextInt();
            String license = input.next();

            switch(type){
                case "Car":
                    Vehicle car = new Car(id, license, mileage);
                    company.addVehicle(car);
                    break;
                case "Truck":
                    boolean doubleLoader = input.nextBoolean();
                    Vehicle truck = new Truck(id, license, mileage, doubleLoader);
                    company.addVehicle(truck);
                    break;
                case "Tractor":
                    String color = input.next();
                    Vehicle tractor = new Tractor(id, license, mileage, color);
                    company.addVehicle(tractor);
                    break;
                case "Motor":
                    boolean sideCar = input.nextBoolean();
                    boolean sadleBags = input.nextBoolean();
                    Vehicle motor = new Motor(id, license, mileage, sideCar, sadleBags);
                    company.addVehicle(motor);
                    break;
                default:
                    System.out.println("That's not a vehicle dummy");
            }
        }
    }

    public void readEmployees(Company company) throws IOException {

        Scanner input = new Scanner(new File("src/src/data/employees.txt"));

        while(input.hasNext()){
            String id = input.next();
            String name = input.next();
            String contractId = input.next();

            Employee employee = new Employee(id, name);
            company.addEmployee(employee);
        }
    }
}
