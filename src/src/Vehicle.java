import java.util.UUID;

public abstract class Vehicle {
    private String id;
    private String license;
    private int mileage;

    public Vehicle(String license, int mileage){

        this.id = UUID.randomUUID().toString();
        this.license = license;
        this.mileage = mileage;
    }

    public String getId() {
        return id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}