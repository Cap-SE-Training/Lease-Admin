package com.capsetrack.leaseadmin;

import com.capsetrack.leaseadmin.models.Employee;
import com.capsetrack.leaseadmin.models.LeaseCompany;
import com.capsetrack.leaseadmin.models.vehicle.*;

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

            Vehicle vehicle = new Car("HR-PD-82", 100);
            Vehicle vehicle2 = new Car("LM-SX-12", 50);
            Vehicle vehicle3 = new Motor("ST-SK-12", 120, true, true);
            Vehicle vehicle4 = new Truck("NU-MM-00", 40, false);
            Vehicle vehicle5 = new Tractor("SX-EL-12", 300,"Green");

        }
    }
}
