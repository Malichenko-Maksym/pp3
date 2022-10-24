public class Lamp {
    boolean lampOn = false;
    public void TurnOn() {
        lampOn = true;
    }
    public void TurnOff() {
        lampOn = false;
    }
    public void ShowStatus() {
      System.out.println("lamp is on: "+lampOn);
    }
  
    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
        l1.TurnOn();
        l2.TurnOff();
        l1.ShowStatus();
        l2.ShowStatus();
    }

  }