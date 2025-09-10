import java.util.Scanner;

public class clgLab15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        
        int count = str.length();
        System.out.println("Number of characters: " + count);

        
        String reverse = "";
        for (int i = count - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);


        if (str.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
}