// WAP to implement the concept of method overloading and method overriding. And Abstract Class.
abstract class Animal {

    public abstract void makeSound();
    public void sleep() {
        System.out.println("This animal is sleeping. Zzz...");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }

    public void play() {
        System.out.println("The dog is playing.");
    }

    public void play(String toy) {
        System.out.println("The dog is playing with the " + toy + ".");
    }
}


public class clgLab3_11 {
    public static void main(String[] args) {

        System.out.println("--- DEMO 1: Abstract Class and Overriding ---");
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
        System.out.println("\n--- DEMO 2: Method Overloading ---");
        myDog.play();
        myDog.play("ball");
    }
}