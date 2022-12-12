import java.util.ArrayList;
public class ShoppingList {
    private ArrayList<Product> list = new ArrayList<Product>();

    public void add(Product product){
        list.add(product);
    }

    @Override
    public String toString() {
        String result =list.get(0).getName()+",";
        for(int elem=1; elem<=list.size()-1; elem+=1){
            result+=list.get(elem).getName(); 
            result+=",";
        }
        String finalR =(String) result.subSequence(0, result.length()-1);
        return finalR;
    } 

    public int total(){
        int amount=0;
        for(int elem=0; elem<=list.size()-1; elem+=1){
            amount+=list.get(elem).getQuantity(); }
        return amount;
    } 
}
