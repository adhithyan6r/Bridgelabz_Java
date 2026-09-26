package javaMethods.Level2;
import java.util.Scanner;
// Problem: Check five numbers for positive or negative, even or odd, and compare the first and last numbers.
public class NumberCheck {
    // Method to check whether a number is positive.
    public static boolean isPositive(int number) {
        return number > 0;
    }
    // Method to check whether a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    // Method to Compare the first and last numbers
    // Returns 1 if first is greater, -1 if last is greater, and 0 if equal
    public static int compare(int first, int last) {
        if (first > last) {
            return 1;
        } else if (first < last) {
            return -1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            // Input; Take five numbers from the user
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.println(number + " is Positive");
                if (isEven(number)) {
                    System.out.println(number + " is Even");
                } else {
                    System.out.println(number + " is Odd");
                }
            } else {
                System.out.println(number + " is Negative");
            }
        }
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than last number");
        } else if (result == -1) {
            System.out.println("Last number is greater than first number");
        } else {
            System.out.println("First and last numbers are equal");
        }
    }
}