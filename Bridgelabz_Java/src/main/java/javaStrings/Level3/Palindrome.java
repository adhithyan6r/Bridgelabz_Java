package javaStrings.Level3;
import java.util.Scanner;
// Problem: Check if a text is palindrome using three different logics and display the result
public class Palindrome{
    // To check palindrome using start and end indexes
    public static boolean checkPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    // To check palindrome using recursion
    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }
    // To reverse the string
    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }
        return reverse;
    }
    // To compare original and reverse character arrays
    public static boolean checkPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take text from the user
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        boolean result1 = checkPalindrome(text);
        boolean result2 = checkPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = checkPalindromeUsingArrays(text);
        System.out.println("Palindrome using logic 1: " + result1);
        System.out.println("Palindrome using logic 2: " + result2);
        System.out.println("Palindrome using logic 3: " + result3);
    }
}