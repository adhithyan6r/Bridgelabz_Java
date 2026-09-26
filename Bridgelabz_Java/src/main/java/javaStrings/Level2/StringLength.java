package javaStrings.Level2;
import java.util.Scanner;

// Problem: Find and return the length of a string without using the length() method.
public class StringLength{

    // Method to find string length
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take a string using next().
        System.out.print("Enter a word: ");
        String text = scanner.next();
        int userDefinedLength = findLength(text);
        int builtInLength = text.length();
        System.out.println("length using user defined method: " + userDefinedLength);
        System.out.println("Length using length(): " + builtInLength);
    }
}