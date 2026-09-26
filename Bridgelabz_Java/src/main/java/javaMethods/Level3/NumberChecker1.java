package javaMethods.Level3;
import java.util.Arrays;
import java.util.Scanner;
// Problem: Check a number for duck and Armstrong properties and find the largest, second largest, smallest, and second smallest digits.
public class NumberChecker1 {
    // Method to Count the number of digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
    // Method to store the digits of the number in an array
    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        int temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
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
    // Method: Check whether the number is an Armstrong number.
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }
    // Method: Find the largest and second largest digits.
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
    // Method: Find the smallest and second smallest digits.
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take the number from the user.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = countDigits(number);
        int[] digits = getDigits(number, count);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("cdount of Digits: " + count);
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(number, digits));
        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestValues[0]);
        System.out.println("second Largest Digit: " + largestValues[1]);
        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestValues[0]);
        System.out.println("Second Smallest Digit: " + smallestValues[1]);
    }
}