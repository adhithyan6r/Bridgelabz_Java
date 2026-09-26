package javaMethods.Level3;
import java.util.Arrays;
import java.util.Scanner;
// Problem: Reverse the digits of a number, compare arrays, and check palindrome and duck number properties.
public class NumberChecker3 {
    // Method: Count the number of digits.
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
    // Method: Store the digits of the number in an array.
    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    // Method: Reverse the digits array.
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    // Method: Compare two arrays and check whether they are equal.
    public static boolean compareArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
    // Method: Check whether the number is a palindrome.
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }
    // Method: Check whether the number is a duck number.
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take the number from the user.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = countDigits(number);
        int[] digits = getDigits(number, count);
        int[] reversed = reverseArray(digits);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed digits: " + Arrays.toString(reversed));
        System.out.println("Arrays equal: " + compareArrays(digits, reversed));
        System.out.println("palindrome number: " + isPalindrome(digits));
        System.out.println("Duck number: " + isDuckNumber(digits));
    }
}