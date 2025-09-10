//Create a class WriteEmployee having a main method. Ask the user to enter the details of an employee and store them in an Employee object. After storing, retrieve the details from the object itself and display those details.
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class clgLab3_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Please enter the employee details:");

        System.out.print("Enter Employee ID: ");
        employee.setId(scanner.nextInt());
        scanner.nextLine(); 

        System.out.print("Enter Employee Name: ");
        employee.setName(scanner.nextLine());

        System.out.print("Enter Department: ");
        employee.setDepartment(scanner.nextLine());

        System.out.print("Enter Salary: ");
        employee.setSalary(scanner.nextDouble());

        System.out.println("\n------------------------------------");
        System.out.println("Employee Details Retrieved from Object:");
        System.out.println("------------------------------------");

        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("------------------------------------");

        scanner.close();
    }
}
