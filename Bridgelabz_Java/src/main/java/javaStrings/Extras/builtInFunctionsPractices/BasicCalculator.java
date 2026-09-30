package javaStrings.Extras.builtInFunctionsPractices;
import java.util.Scanner;
public class BasicCalculator {
    //method for addition
    public static double add(double a, double b) {
        return a + b;
    }// Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }// Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }// method for divisiom
    public static double divide(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation: ");
        int choice = scanner.nextInt();
        //switch case for selecting the operation
        switch (choice) {
            case 1:
                System.out.println("Result: " + add(a, b));
                break;
            case 2:
                System.out.println("Result: " + subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + multiply(a, b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("invalid");
                } else {
                    System.out.println("reesult: " + divide(a, b));
                }
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}