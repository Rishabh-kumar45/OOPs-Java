import java.util.ArrayList;
import java.util.Iterator;

public class clgLab6_34 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        System.out.println("Original ArrayList: " + list);

        // Create an Iterator
        Iterator<String> it = list.iterator();

        System.out.println("Iterating through the ArrayList:");

        // Traverse elements using Iterator
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }
    }
}