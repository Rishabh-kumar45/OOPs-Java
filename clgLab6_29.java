import java.util.LinkedList;
import java.util.ListIterator;

public class clgLab6_29 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original LinkedList: " + list);

        System.out.println("Iterating in Reverse Order:");

        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
    }
}