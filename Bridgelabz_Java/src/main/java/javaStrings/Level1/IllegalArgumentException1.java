package javaStrings.Level1;
import java.util.Scanner;
// Problem: Demonstrate IllegalArgumentException using substring().
public class IllegalArgumentException1 {
    // Method: Generate IllegalArgumentException.
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }
// Method: Handle IllegalArgumentException and RuntimeException.
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException exception) {
            System.out.println("IllegalArgumentException handled.");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take a String using next().
        System.out.print("Enter text: ");
        String text = scanner.next();
        // First call generates the exception.
        // generateException(text);
        // Call the method to handle the RuntimeException.
        handleException(text);
    }
}