package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.Employee;
import com.capsetrack.leaseadmin.models.LeaseCompany;
import com.capsetrack.leaseadmin.models.LeaseContract;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Company company = new Company("Capgemini");

        boolean quit = false;

        LeaseCompany leaseCompany = ConsoleCommands.pickLeaseCompany();

        if (leaseCompany == null) {
            quit = true;
        }

        while (!quit) {
            System.out.println("\nEnter action: (9 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    ConsoleCommands.printVehicles(leaseCompany);
                    break;
                case 2:
                    try {
                        ConsoleCommands.addContract(company, leaseCompany);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Please try again!");
                    }
                    break;
                case 9:
                    printActions();
                    break;
            }

        }
//
//        Employee employee = new Employee("Kees");
//
//        LeaseContract contract = new LeaseContract(leaseCompany.getVehicles().get(0),employee, 50);
//
////        contract.calculateProgress();
//
//        Timer timer = new Timer();
//
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                contract.calculateNewProgress();
//            }
//        }, 5000, 5000);

    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print vehicles\n" +
                "2  - to rent a vehicle\n" +
                "9  - to print a list of available actions.\n");

        System.out.println("Choose your action: ");
    }
}
