import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class test {
    

    public static void main(String[] args) {
    
    ArrayList<Integer> animals = new ArrayList<Integer>();
    animals.add(4);
    animals.add(55);
    animals.add(3);
    System.out.println(animals);
    Collections.shuffle(animals);
    System.out.println(Collections.max(animals));
       
    }
}
