package javaStrings.Level1;
import java.util.Scanner;

// Problem: Create a substring using charAt() and compare it with substring().
public class Substring{
    // Method: Create substring
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
    // Method: Compare two strings
    public static boolean compareStrings(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: get user's text, start index, and end index.
        System.out.print("Enter text: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        String userSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);
        boolean result = compareStrings(userSubstring, builtInSubstring);
        System.out.println("Substring using charAt(): " + userSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Both strings are same: " + result);
    }
}