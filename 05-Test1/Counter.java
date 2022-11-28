public class Counter {
   private int counter = 0;

   public void increase(){
        counter+=1;
    }

    public void increase(int n){
        counter+=n;
    }


    public void decrease(){
        counter-=1;
    }

    public void decrease(int n){
        counter-=n;
    }

    public int value(){
        return counter;
    }
}
