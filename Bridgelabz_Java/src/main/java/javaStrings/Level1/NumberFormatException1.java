package javaStrings.Level1;
import java.util.Scanner;
// Problem: Demonstrate NumberFormatException using Integer.parseInt().
public class NumberFormatException1 {
    // Method: Generate NumberFormatException.
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }
    // Method: Handle NumberFormatException and RuntimeException.
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException exception) {
            System.out.println("NumberFormatException handled.");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take a String
        System.out.print("Enter text: ");
        String text = scanner.next();
        // First call generates the exceptio
        // Call the method to handle the RuntimeException
        handleException(text);
    }
}