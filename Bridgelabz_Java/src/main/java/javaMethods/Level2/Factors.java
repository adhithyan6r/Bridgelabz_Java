package javaMethods.Level2;
import java.util.Arrays;
import java.util.Scanner;
// Problen: Find the factors of a number and calculate their sum, product, and sum of squares.
public class Factors {
    // Method: Find and return all factors of the number.
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    // Method to calculate the sum of all factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    // Method to calculate the product of all factors
    public static int findProduct(int[] factors) {
        int product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }
    // Methodto calculate the sum of squares of all factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + findSum(factors));
        System.out.println("Product: " + findProduct(factors));
        System.out.println("Sum of Squares: " + findSumOfSquares(factors));
    }
}