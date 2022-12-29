public class Car extends Vehicle {

    public Car(int sits, double fuelCapacity) {
        super(sits,fuelCapacity);
    }

    @Override
    public void go() {
        System.out.println("Car is going!");
        
    }


    public static void main(String[] args) {
        Car c1 = new Car(4,5.6);
        c1.go();
        Bus b1 = new Bus(32, 60, true);
        Truck t1 = new Truck(3, 105, 1000);
        b1.go();
        t1.go();
    }
    
    
}
