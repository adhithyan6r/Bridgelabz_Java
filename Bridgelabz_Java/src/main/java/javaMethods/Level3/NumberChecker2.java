package javaMethods.Level3;
import java.util.Arrays;
import java.util.Scanner;
// Problem: Find digit sum, sum of digit squares, check Harshad number, and find digit frequencies.
public class NumberChecker2 {
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
    // Method: Find the sum of the digits.
    public static int findDigitSum(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    // Method: Find the sum of squares of the digits.
    public static double findSumOfSquares(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    // Method: Check whether the number is a Harshad number.
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findDigitSum(digits);
        return number % sum == 0;
    }
    // Method: Find the frequency of each digit.
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take the number from the user.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = countDigits(number);
        int[] digits = getDigits(number, count);
        int digitSum = findDigitSum(digits);
        double squareSum = findSumOfSquares(digits);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + digitSum);
        System.out.println("Sum of Squares: " + squareSum);
        System.out.println("Harshad Number: " + isHarshadNumber(number, digits));
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(
                        "Digit " + frequency[i][0] +
                                " = " + frequency[i][1]
                );
            }
        }
    }
}