/*WAP to Create a class Employee having members as follows:

private int empNo

private String empName

private int empBasic

Parameterized constructor to initialize members.

Getter methods for all instance variables*/
class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

    public Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpBasic() {
        return empBasic;
    }
}

public class clgLab3_12{
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Rishabh", 500000);

        int number = emp1.getEmpNo();
        String name = emp1.getEmpName();
        int salary = emp1.getEmpBasic();

        System.out.println("--- Employee Details ---");
        System.out.println("Employee Number: " + number);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
    }
}
