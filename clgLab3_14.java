//WAP to create a class named Shape and create three subclasses Circle, Triangle and Square, each class has two-member functions named draw () and erase (). Implement this concept using polymorphism
class Shape {
    public void draw() {
        System.out.println("Drawing a Shape");
    }

    public void erase() {
        System.out.println("Erasing a Shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Triangle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Square");
    }
}

public class clgLab3_14 {
    public static void main(String[] args) {
        Shape shape;

        System.out.println("--- Demonstrating Polymorphism ---");

        shape = new Circle();
        System.out.print("Calling methods on a Circle object: ");
        shape.draw();

        shape = new Triangle();
        System.out.print("Calling methods on a Triangle object: ");
        shape.draw();
        shape.erase();

        shape = new Square();
        System.out.print("Calling methods on a Square object: ");
        shape.draw();
        shape.erase();
    }
}
