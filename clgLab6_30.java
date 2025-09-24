import java.util.LinkedHashSet;

public class clgLab6_30 {
    public static void main(String[] args) {
    
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Red");
        set.add("Green");
        set.add("Blue");

        System.out.println("Original LinkedHashSet: " + set);

        String newElement = "Yellow";
        set.add(newElement);

        System.out.println("After appending '" + newElement + "': " + set);
    }
}