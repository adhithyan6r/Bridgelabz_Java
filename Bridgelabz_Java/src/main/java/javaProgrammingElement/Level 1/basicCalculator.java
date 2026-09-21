import java.util.Scanner;
public class basicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        System.out.println("The addition, subtraction, multiplication and division of " + num1 + " and " + num2 + " is: " + addition + ", " + subtraction + ", " + multiplication + " and " + division);
    }
}