/* Polymorphism -> Many Forms
1) Compile time Polymorphism(AKA Static Polymorphism) -> Based on method overloading : This happens when multiple methods in the same class have the same name but different parameters.
In this object is bound with their functionalities at the compile time.
2) Run time Polymorphism(AKA Dynamic Method Dispatch) -> Based on method overriding : It is achieved by the method overriding.
* Method overriding allows a subclass to modify or extend the behaviour of an existing method in the parent class.

Rules for method overloading:
All the overloaded methods must have the same name
All the methods should be in the same class
All the method parameters must be different -> No. of parameters 
                                            ->Types of parameters
                                            -> Order of parameters
                                            
Rules for method overriding
All the methods must have the same name
All the methods should be in different class
All the methods parameters list must be same
Should follow is a Relationship(inheritance)*/

//Method Overloading
// class Student{
//     public void read(){
//         System.out.println("Reading Java Book");
//     } 
//     public void read(String bookName){
//         System.out.println("Reading" + " " + bookName + " " + "Book");
//     }
// }

// public class Polymorphism{
//     public static void main(String[] args){
//         System.out.println("Testing");
//         Student s1 = new Student();
//         s1.read("OS");        //If we do not pass parameter Reading java book will be output and if we pass the parameter Reading OS book will be printed.
//     }
// }

//Method overriding
class Person{
    public void showDetails(){
        System.out.println("Details of Person");
    }
}
class Emp extends Person{
    public void showDetails(){
        System.out.println("Showing the details of Employee");
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        System.out.println("Testing");
        Person p1 = new Emp();
        p1.showDetails();
    }
    }


//** Can we overload or override main method? : We can overload but not override.
// Program written in static will always executed before main method. 
// public class Polymorphism{
// static{
//     System.out.println("Hii")
// }}
// public static void main{
//     System.out.println("Hello")
// }

//Can not inherit from final class