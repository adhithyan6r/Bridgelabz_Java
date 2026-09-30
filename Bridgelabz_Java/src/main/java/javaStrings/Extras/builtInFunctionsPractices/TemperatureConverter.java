package javaStrings.Extras.builtInFunctionsPractices;
import java.util.Scanner;
//PRogram to convert temperature units
public class TemperatureConverter {
    //Used for converting fahrenheit to celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return Math.round((fahrenheit - 32) * 5.0 / 9.0 * 100) / 100.0;
    }//used for converting celsius to fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return Math.round((celsius * 9.0 / 5.0 + 32) * 100) / 100.0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) fahrenheit to celsius");
        System.out.println("2) celsius to fahrenheit");
        System.out.print("Choose an option; ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
        } else if (choice == 2) {
            System.out.print("enter celsius: ");
            double celsius = scanner.nextDouble();
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
        } else {
            System.out.println("Invalid choice");
        }
    }
}