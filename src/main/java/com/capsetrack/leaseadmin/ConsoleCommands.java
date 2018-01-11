package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.Employee;
import com.capsetrack.leaseadmin.models.LeaseCompany;
import com.capsetrack.leaseadmin.models.LeaseContract;
import com.capsetrack.leaseadmin.models.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class ConsoleCommands {

    private static Scanner scanner = new Scanner(System.in);

    public static LeaseCompany pickLeaseCompany() {
        System.out.println("1 - Athlon");
        System.out.println("2 - DieAnder");
        System.out.println("3 - Cancel");

        int company = scanner.nextInt();
        scanner.nextLine();

        if (company == 1) {
            return new LeaseCompany("Athlon");
        } else if (company == 2) {
            return new LeaseCompany("DieAnder");
        } else {
            return null;
        }
    }

    public static void addContract(Company company, LeaseCompany leaseCompany) throws Exception {
        System.out.println("\n What is your employee id?");
        String id = scanner.nextLine();

        Employee employee = company.getEmployee(id);

        HashMap<Integer, String> types = new HashMap<Integer, String>();
        types.put(1, "Car");
        types.put(2, "Motor");
        types.put(3, "Truck");
        types.put(4, "Tractor");

        System.out.println("\n What type of vehicle would you like?");
        for (HashMap.Entry<Integer, String> entry : types.entrySet()) {
            System.out.println(entry.getKey() + " - A " + entry.getValue());
        }
        System.out.println("5 - Cancel");

        int type = scanner.nextInt();
        scanner.nextLine();

        if (type > 4) {
            return;
        }

        Vehicle vehicle = leaseCompany.getFreeVehicle(types.get(type));

        System.out.println("\n For how long would you like to rent the vehicle?");
        long duration = scanner.nextLong();
        scanner.nextLine();

        LeaseContract leaseContract = new LeaseContract(vehicle, employee, duration);
        leaseCompany.addContract(leaseContract);

        System.out.println("Good luck with your vehicle.\n");
        System.out.println(vehicle.toString());
    }

    public static void printVehicles(LeaseCompany leaseCompany) {


        System.out.println("Choose next action\n" +
                "1 - Print all vehicles\n" +
                "2 - Print available vehicles\n" +
                "3 - Cancel");

        int type = scanner.nextInt();

        switch (type) {
            case 1:
                leaseCompany.listVehicles();
                break;
            case 2:
                leaseCompany.listAvailableVehicles();
                break;
            default:
                break;
        }


    }
}
