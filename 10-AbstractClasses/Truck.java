public class Truck extends Vehicle {

      private double loadCapacity;

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Truck(int sits, double fuelCapacity,double loadCapacity) {
        super(sits,fuelCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void go() {
        System.out.println("Truck is going!");
        
    }
}
