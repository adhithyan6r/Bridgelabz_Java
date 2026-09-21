import java.util.Scanner;
public class doubleOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("enter third number: ");
        double c = scanner.nextDouble();
        double  p = a + b * c;
        double q = a * b + c;
        double r = c+a / b;
        double s = a % b + c;
        System.out.println("The result of double operations is: " + p + ", " + q + ", " + r + ", " + s);
    }
}