import java.util.ArrayList;
import java.util.Scanner;

public class clgLab6_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original ArrayList: " + list);

        System.out.print("Enter element to insert at first position: ");
        int element = sc.nextInt();

        list.add(0, element);

        System.out.println("Updated ArrayList: " + list);

        sc.close();
    }
}