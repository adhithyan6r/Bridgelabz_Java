package javaMethods.Level2;
import java.util.Scanner;
// Problem: Create methods to convert kilometers to miles, miles to kilometers, meters to feet, and feet to meters
public class UnitConverterKM {
    // Method: Convert kilometers to miles
    public static double kmToMiles(double km) {
        return km * 0.621371;
    }
    // Method: Convert miles to kilometers
    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }
    // Method: Convert meters to feet
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }
    // Method: Convert feet to meters
    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take conversion choice from user
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        // Input: Take value from user
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("Result: " + kmToMiles(value) + " miles");
                break;
            case 2:
                System.out.println("Result: " + milesToKm(value) + " kilometers");
                break;
            case 3:
                System.out.println("Result: " + metersToFeet(value) + " feet");
                break;
            case 4:
                System.out.println("Result: " + feetToMeters(value) + " meters");
                break;
            default:
                System.out.println("Invalid choice");
        }
            }
}