package javaStrings.Level1;
import java.util.Scanner;
// Problem: Convert the complete text to lowercase and compare the results.
public class ConvertToLower{
    // Method: Convert uppercase characters to lowercase
    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character >= 'A' && character <= 'Z') {
                character = (char) (character + 32);
            }
            result = result + character;
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
        // Input: Take complete text
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        String userDefinedText = convertToLowerCase(text);
        String builtInText = text.toLowerCase();
        boolean result = compareStrings(userDefinedText, builtInText);
        System.out.println("using charAt(): " + userDefinedText);
        System.out.println("using toLowerCase(): " + builtInText);
        System.out.println("Both results are same: " + result);
    }
}