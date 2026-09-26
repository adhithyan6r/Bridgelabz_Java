package javaStrings.Level1;
import java.util.Scanner;
// Problem: Demonstrate ArrayIndexOutOfBoundsException using an array of names.
public class ArrayIndexOutOfBoundsException1 {
    // Method: Generate ArrayIndexOutOfBoundsException.
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }
    // Method: Handle ArrayIndexOutOfBoundsException and RuntimeException.
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException handled.");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Create an array of names and take input from the user.
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        // First call generates the exception.
        // generateException(names);
        // Call the method to handle the RuntimeException.
        handleException(names);
    }
}