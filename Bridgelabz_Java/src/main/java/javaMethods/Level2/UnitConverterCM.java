package javaMethods.Level2;
import java.util.Scanner;
// Problem: Create methods to convert yards to feet, feet to yards, meters to inches, inches to meters, and inches to centimeters.
public class UnitConverterCM {
    // Method: Convert yards to feet
    public static double yardsToFeet(double yards) {
        return yards * 3;
    }
    // Method: Convert feet to yards
    public static double feetToYards(double feet) {
        return feet / 3;
    }
    // Method: Convert meters to inches
    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }
    // Method: Convert inches to meters
    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }
    // Method: Convert inches to centimeters
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take conversion choice from user
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        // Input: Take value from user
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("Result: " + yardsToFeet(value) + " feet");
                break;
            case 2:
                System.out.println("Result: " + feetToYards(value) + " yards");
                break;
            case 3:
                System.out.println("Result: " + metersToInches(value) + " inches");
                break;
            case 4:
                System.out.println("Result: " + inchesToMeters(value) + " meters");
                break;
            case 5:
                System.out.println("Result: " + inchesToCentimeters(value) + " centimeters");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}