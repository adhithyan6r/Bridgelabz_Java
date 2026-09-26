package javaMethods.Level3;
import java.util.Scanner;
// Problem: Check whether a number is prime, neon, spy, automorphic, and buzz.
public class NumberChecker4 {
    // Method: Check whether the number is prime.
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Method: Check whether the number is a neon number.
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }
    // Method: Check whether the number is a spy number.
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }
    // Method: Check whether the number is an automorphic number.
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }
    // Method: Check whether the number is a buzz number.
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take the number from the user.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Prime Number: " + isPrime(number));
        System.out.println("Neon Number: " + isNeon(number));
        System.out.println("Spy Number: " + isSpy(number));
        System.out.println("Automorphic Number: " + isAutomorphic(number));
        System.out.println("Buzz Number: " + isBuzz(number));
    }
}