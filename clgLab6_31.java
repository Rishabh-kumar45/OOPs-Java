import java.util.TreeSet;

public class clgLab6_31 {
    public static void main(String[] args) {
        // Create first TreeSet
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        // Create second TreeSet
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(40);
        set2.add(50);

        System.out.println("First TreeSet: " + set1);
        System.out.println("Second TreeSet: " + set2);

        // Add all elements of set2 to set1
        set1.addAll(set2);

        System.out.println("After adding all elements from second TreeSet to first: " + set1);
    }
}