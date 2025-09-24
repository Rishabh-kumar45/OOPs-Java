import java.util.TreeMap;

public class clgLab6_33 {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Orange");
        treeMap.put(4, "Mango");

        System.out.println("TreeMap: " + treeMap);

        // Value to search
        String valueToSearch = "Orange";

        // Search for the value
        if (treeMap.containsValue(valueToSearch)) {
            System.out.println(valueToSearch + " is present in the TreeMap.");
        } else {
            System.out.println(valueToSearch + " is not present in the TreeMap.");
        }
    }
}