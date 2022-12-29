public class Bus extends Vehicle  {
   private boolean onRoad;

    public boolean isOnRoad() {
    return onRoad;
}

public void setOnRoad(boolean onRoad) {
    this.onRoad = onRoad;
}

    public Bus(int sits, double fuelCapacity, boolean onRoad) {
        super(sits,fuelCapacity);
        this.onRoad=onRoad;
    }

    @Override
    public void go() {
        System.out.println("Bus is going!");
        
    }
}
