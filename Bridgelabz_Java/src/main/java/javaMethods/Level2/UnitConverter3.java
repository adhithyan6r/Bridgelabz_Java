package javaMethods.Level2;
import java.util.Scanner;
// Problem: Create methods to convert Fahrenheit to Celsius, Celsius to Fahrenheit, pounds to kilograms, kilograms to pounds, gallons to liters, and liters to gallons
public class UnitConverter3 {
    // Method: Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    // Method: Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    // Method: Convert pounds to kilograms
    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    // Method: Convert kilograms to pounds
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    // Method: Convert gallons to liters
    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    // Method: Convert liters to gallons
    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: get 1choice from user
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        // Input: Take value from user
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("Result: " + fahrenheitToCelsius(value) + " Celsius");
                break;
            case 2:
                System.out.println("Result: " + celsiusToFahrenheit(value) + " Fahrenheit");
                break;
            case 3:
                System.out.println("Result: " + poundsToKilograms(value) + " kilograms");
                break;
            case 4:
                System.out.println("Result: " + kilogramsToPounds(value) + " pounds");
                break;
            case 5:
                System.out.println("Result: " + gallonsToLiters(value) + " liters");
                break;
            case 6:
                System.out.println("Result: " + litersToGallons(value) + " gallons");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}