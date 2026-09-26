package javaStrings.Level1;
import java.util.Scanner;
// Problem: Compare two strings using charAt() and check the result with equals().
public class TextCompare{
    // Method: Compare two strings using charAt().
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
        // Input: Take two strings using next().
        System.out.print("Enter first string: ");
        String text1 = scanner.next();
        System.out.print("Enter second string: ");
        String text2 = scanner.next();
        boolean charAtResult = compareStrings(text1, text2);
        boolean equalsResult = text1.equals(text2);
        System.out.println("Utsing charAt(): " + charAtResult);
        System.out.println("using equals(): " + equalsResult);
        System.out.println("Both results are same: " + (charAtResult == equalsResult));
    }
}