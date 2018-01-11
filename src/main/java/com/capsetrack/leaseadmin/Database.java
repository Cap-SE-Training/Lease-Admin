package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.Employee;
import com.capsetrack.leaseadmin.models.LeaseCompany;
import com.capsetrack.leaseadmin.models.vehicle.*;
import com.capsetrack.leaseadmin.models.vehicle.VehicleInfo.EngineInfo;
import com.capsetrack.leaseadmin.models.vehicle.enums.Brand;
import com.capsetrack.leaseadmin.models.vehicle.enums.Fuel;
import com.capsetrack.leaseadmin.models.vehicle.enums.Transmission;
import com.sun.prism.paint.Color;

import java.io.*;
import java.util.ArrayList;

public class Database {
    public static void save(String path, ArrayList objects) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(objects);
        oos.close();
    }

    public static ArrayList load(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList objects = (ArrayList) ois.readObject();
        ois.close();
        return objects;
    }

    public static void saveFixtures() throws IOException {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Niels Opdam"));
        employees.add(new Employee("Sascha Van den Hurk"));
        employees.add(new Employee("Jimmy Knoot"));
        employees.add(new Employee("Ian Nelissen"));
        employees.add(new Employee("Alexander Van 't Hof"));
        employees.add(new Employee("Mustafa Afkir"));
        Database.save("employees.tmp", employees);

        ArrayList<LeaseCompany> leaseCompanies = new ArrayList<LeaseCompany>();
        leaseCompanies.add(new LeaseCompany("Athlon"));
        leaseCompanies.add(new LeaseCompany("thatOtherCompany"));
        Database.save("leaseCompanies.tmp", leaseCompanies);

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        EngineInfo engine = new EngineInfo(100, Fuel.Hydrogen, Transmission.Manual);
        vehicles.add(new Car("00-12-ZV", Brand.Ford, 10, 200, 26000, engine));
        vehicles.add(new Truck("KL-14-KS", Brand.Toyota, 20, 250, 24000, engine, true));
        vehicles.add(new Motor("NV-57-DS", Brand.Volvo, 25, 350, 23000, engine, true, true));
        vehicles.add(new Tractor("LA-04-RZ", Brand.Volkswagen, 15, 450, 27000, engine, Color.GREEN.toString()));
        vehicles.add(new Car("69-ZM-PQ", Brand.Toyota, 30, 200, 20000, engine));
        Database.save("vehicles.tmp", vehicles);
    }
}
