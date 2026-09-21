import java.util.Scanner;
public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("base: ");
        double base = scanner.nextDouble();
        System.out.print("height: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
    }
}
