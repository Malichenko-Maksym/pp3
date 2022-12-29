public abstract class Vehicle {
    protected int sits;
    protected double fuelCapacity;
    public Vehicle(int sits, double fuelCapacity) {
        this.sits = sits;
        this.fuelCapacity = fuelCapacity;
    }
    public abstract void go();
    public void makeSound(){
        System.out.println("Beeep!");
    }
}
