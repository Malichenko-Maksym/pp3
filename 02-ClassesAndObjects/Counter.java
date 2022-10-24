

public class Counter {
    int number;
 
     Counter() {
        number = 0;
     }
     public void Reset() {
        number = 0;
     }
     public void DecreasedTen() {
         number -= 10;
     }
     public void IncreasedTen() {
        number += 10;
    }
    public void DecreasedOne() {
        number -= 1;
    }
    public void IncreasedOne() {
        number += 1;
    }
    public void ShowNumber() {
        System.out.println(number);
    }
   
     public static void main(String[] args) {
         Counter l1 = new Counter();
         Counter l2 = new Counter();
         l1.IncreasedTen();
         l1.IncreasedTen();
         l1.IncreasedOne();
         l1.IncreasedOne();
         l1.IncreasedOne();
         l1.ShowNumber();
         
         l2.DecreasedTen();
         l2.DecreasedTen();
         l2.DecreasedTen();
         l2.DecreasedTen();
         l2.DecreasedTen();
         l2.IncreasedOne();
         l2.IncreasedOne();
         l2.IncreasedOne();
         l2.ShowNumber();
     }
 
   }