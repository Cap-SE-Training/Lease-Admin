public class Tractor extends Vehicle {

    private String color;

    public Tractor(String color, String license, int mileage) {
        super (license, mileage);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
