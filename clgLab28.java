import java.util.Scanner;

class Room {
    int roomNo;
    String roomType;
    double roomArea;
    boolean ACmachine;

    void setData(int roomNo, String roomType, double roomArea, boolean ACmachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.ACmachine = ACmachine;
    }

    void displayData() {
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " sq.ft.");
        System.out.println("AC Available: " + (ACmachine ? "Yes" : "No"));
    }
}

public class clgLab28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room room1 = new Room();

        System.out.print("Enter Room Number: ");
        int no = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Room Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Room Area (sq.ft.): ");
        double area = sc.nextDouble();

        System.out.print("Is AC available? (true/false): ");
        boolean ac = sc.nextBoolean();

        room1.setData(no, type, area, ac);

        System.out.println("\n Room Details");
        room1.displayData();
    }
}