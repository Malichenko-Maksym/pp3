public class SuperCounter extends Counter {
    private int counter;
    SuperCounter(int c) {
        super(c);
        counter=c;
    }

    public void addN(int n){
        counter+=n;
    } 
    
}
