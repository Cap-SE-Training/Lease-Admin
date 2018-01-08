public class LeaseCompany {
    private String name;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Leasecontract> leasecontracts;

    public void addVehicle(Vehicle _vehicle) {
        boolean found = false;
        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.license === _vehicle.license) {
                found = true;
            }
        }
        if (found) {
            return;
        }

        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public void updateVehicle(String license, Vehicle vehicle) {
        // logic
    }

    public ArrayList<Leasecontract> listContracts() {
        return this.leasecontracts;
    }

    public void addContract(Leasecontract _leasecontract) {
        boolean found = false;
        for (Leasecontract leasecontract : this.leasecontracts) {
            if (leasecontract.getVehicle().license === _leasecontract.getVehicle().license) {
                found = true;
            }
        }
        if (found) {
            return;
        }

        this.leasecontracts.add(leasecontract);
    }

    public void removeContract(Leasecontract leasecontract) {
        this.leasecontracts.remove(leasecontract);
    }

    public void updateContract(Leasecontract leasecontract) {
        // logic
    }
}
