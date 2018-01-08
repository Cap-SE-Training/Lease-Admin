public class Motor extends Vehicle {

   private boolean sideCar;
   private boolean saddleBags;

    public Motor(boolean sideCar, boolean saddleBags) {
        this.sideCar = sideCar;
        this.saddleBags = saddleBags;
    }

    public boolean isSideCar() {
        return sideCar;
    }

    public boolean isSaddleBags() {
        return saddleBags;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }

    public void setSaddleBags(boolean saddleBags) {
        this.saddleBags = saddleBags;
    }
}
