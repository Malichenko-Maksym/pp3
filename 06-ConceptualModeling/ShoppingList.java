import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ShoppingList {
   private int numberOfProducts = 0;

    public void showNumberOfProducts() {
        System.out.println(numberOfProducts);
    }

    
   private ArrayList<Product> products = new ArrayList<Product>();


    public void showProducts() {
        System.out.println(products);
    }

   void addProduct(Product someProduct) {
        products.add(someProduct);
        numberOfProducts+=1;
    }

    public static void main(String[] args) {
        ShoppingList s1 = new ShoppingList();
        s1.showProducts();
        s1.showNumberOfProducts();
        s1.addProduct(new Product("Milk", 300));
        s1.showProducts();
        s1.showNumberOfProducts();
        s1.addProduct(new Product("Juice", 8900));
        s1.showProducts();
        s1.showNumberOfProducts();
    }
}
