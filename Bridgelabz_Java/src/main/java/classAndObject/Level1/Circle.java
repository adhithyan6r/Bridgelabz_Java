package classAndObject.Level1;
import  java.util.Scanner;
//class to find the area of the circle and display
public class Circle {
    int radius = 0;
    public double findArea(){
        double area = 3.14 * (radius*radius);
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle1 = new Circle();
        System.out.println("Enter radius of Circle: ");
        circle1.radius = scanner.nextInt();

        double result = circle1.findArea();
        System.out.println("Area of circle : "+ result);



    }

}
