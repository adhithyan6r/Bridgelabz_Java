package javaMethods.Level3;
import java.util.Arrays;
import java.util.Scanner;
// Problem: Find factors and check whether a number is perfect, abundant, deficient, or strong.
public class NumberChecker5 {
    // Method: Find all factors and return them as an array.
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop: Count the number of factors.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        // Second loop: Store the factors in the array.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    // Method: Find the greatest factor.
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    // Method: Find the sum of the factors.
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    // Method: Find the product of the factors.
    public static int findProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    // Method: Find the product of cubes of the factors.
    public static double findCubeProduct(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    // Method: Check whether the number is a perfect number.
    public static boolean isPerfect(int number, int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum == number;
    }
    // Method: Check whether the number is an abundant number.
    public static boolean isAbundant(int number, int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum > number;
    }
    // Method: Check whether the number is a deficient number.
    public static boolean isDeficient(int number, int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum < number;
    }
    // Method: Calculate the factorial of a digit.
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    // Method: Check whether the number is a strong number.
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take the number from the user.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSum(factors));
        System.out.println("Product of Factors: " + findProduct(factors));
        System.out.println("Product of Cube of Factors: " + findCubeProduct(factors));
        System.out.println("Perfect Number: " + isPerfect(number, factors));
        System.out.println("Abundant Number: " + isAbundant(number, factors));
        System.out.println("Deficient Number: " + isDeficient(number, factors));
        System.out.println("Strong Number: " + isStrong(number));
    }
}