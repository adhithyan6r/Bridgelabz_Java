package javaStrings.Level1;
import java.util.Scanner;
// Problem: Demonstrate StringIndexOutOfBoundsException
public class StringIndexOutOfBoundException {
    // Method: Generate StringIndexOutOfBoundsException.
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }
    // Method: Handle StringIndexOutOfBoundsException.
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("StringIndexOutOfBoundsException handled.");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take a String
        System.out.print("Enter text: ");
        String text = scanner.next();
        // First call generates the exception.
        // Call the method to handle the RuntimeException.
        handleException(text);
    }
}