package javaStrings.Level2;
import java.util.Scanner;
// Problem: Trim leading and trailing spaces from a string using charAt() and compare with trim().
public class TrimString{
    //This method is used for finding the starting and ending indexes
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length();
        // Find the first non space character
        while (start < end && text.charAt(start) == ' ') {
            start++;
        }
        // Finding last non space character
        while (end > start && text.charAt(end - 1) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    // Method to create trimmed string
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
    // Method to compare two strings
    public static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // getting input from the user
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        int[] indexes = findTrimIndexes(text);
        String userDefinedTrim = createSubstring(
                text,
                indexes[0],
                indexes[1]
        );
        String builtInTrim = text.trim();
        System.out.println("User defined trim: [" + userDefinedTrim + "]");
        System.out.println("using trim():    [" + builtInTrim + "]");
        System.out.println("Both results are same: " + compareStrings(userDefinedTrim, builtInTrim));

    }
}