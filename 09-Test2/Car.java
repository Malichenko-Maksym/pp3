public class Car extends Vehicle {
    Car(int s, int maxSpeed) {
        super(s);
        this.maxSpeed=maxSpeed;
        //TODO Auto-generated constructor stub
    }

    public int[] spec(){
        int[] finRes= new int[]{getSeats(),maxSpeed};
        return finRes;
    } 

    private int maxSpeed;
}
