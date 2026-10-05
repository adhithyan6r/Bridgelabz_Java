package javaConstructors.Level1;
// Class to initialize circle radius using default and parameterized constructors
public class Circle {
    double radius;
    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public void display() {
        System.out.println("Radius: " + radius);
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.5);
        circle1.display();
        circle2.display();
    }
}