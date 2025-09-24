import java.util.ArrayList;
import java.util.Collection;

public class clgLab6_35 {
    public static void main(String[] args) {

        Iterable<String> iterable = new ArrayList<>();
        ((ArrayList<String>) iterable).add("Apple");
        ((ArrayList<String>) iterable).add("Banana");
        ((ArrayList<String>) iterable).add("Orange");

        System.out.println("Original Iterable:");
        for (String s : iterable) {
            System.out.println(s);
        }

        Collection<String> collection = new ArrayList<>();
        for (String s : iterable) {
            collection.add(s);
        }

        System.out.println("\nConverted Collection:");
        for (String s : collection) {
            System.out.println(s);
        }
    }
}