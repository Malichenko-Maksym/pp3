public class BeverageCan {
    double capacity;
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        if (capacity>0){this.capacity = capacity;
        } else {
            System.out.println("WTF?");
        }
        
    }
    String drinkName;
    public String getDrinkName() {
        return drinkName;
    }
    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }
    boolean isEmpty;
    public boolean isEmpty() {
        return isEmpty;
    }
    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    BeverageCan(double capacity, String drinkName, boolean isEmpty){
        if (capacity>0){
            this.capacity = capacity;
            this.drinkName = drinkName;
            this.isEmpty = isEmpty;
        } else {
            System.out.println("WTF?");
        }
    }
}
