public class Truck extends Vehicle {

    private boolean dubbleLoader;

    public Truck(boolean dubbleLoader, String license, int mileage) {
        super (license, mileage);
        this.dubbleLoader = dubbleLoader;
    }

    public boolean isDubbleLoader() {
        return dubbleLoader;
    }

    public void setDubbleLoader(boolean dubbleLoader) {
        this.dubbleLoader = dubbleLoader;
    }
}
