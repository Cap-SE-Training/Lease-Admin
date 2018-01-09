public class Main {

        public static void main(String[] args) {
            Employee employee = new Employee();
            employee.setName("Niels Opdam");

            Employee employee1 = new Employee();
            employee1.setName("Sascha Van den Hurk");

            Employee employee2 = new Employee();
            employee.setName("Jimmy Knoot");

            Employee employee3 = new Employee();
            employee3.setName("Ian Nelissen");

            Employee employee4 = new Employee();
            employee4.setName("Alexander Van 't Hof");

            Employee employee5 = new Employee();
            employee5.setName("Mustafa Afkir");

            Leasecompany athlon = new Leasecompany();
            athlon.setName("Athlon");

            Leasecompany thatOtherCompany = new Leasecompany();
            thatOtherCompany.setName("thatOtherCompany");

            Vehicle vehicle = new Car();
            vehicle.setLicense("HR-PD-82");
            vehicle.setMileage(100);

            Vehicle vehicle2 = new Car();
            vehicle2.setLicense("LM-SX-12");
            vehicle2.setMileage(50);

            Vehicle vehicle3 = new Motor(true, true);
            vehicle3.setLicense("ST-SK-12");
            vehicle3.setMileage(120);

            Vehicle vehicle4 = new Truck(false);
            vehicle4.setLicense("NU-MM-00");
            vehicle4.setMileage(40);

            Vehicle vehicle5 = new Tractor("Green");
            vehicle5.setLicense("SX-EL-12");
            vehicle5.setMileage(300);
        }
    }
}
