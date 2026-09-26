package javaMethods.Level2;
import java.util.Scanner;
// Problem: Find the sum of n natural numbers using recursion and compare it with the formula
public class SumOfNumbers {
    // Method to calculate the sum using recursion
    public static int calculateSumRecursive(int number) {
        if (number == 1) {
            return 1;
        }
        return number + calculateSumRecursive(number - 1);
    }
    // Method to calculate the sum using the formula.
    public static int calculateSumFormula(int number) {
        return number * (number + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take n from the user
        System.out.print("Enter n: ");
        int number = scanner.nextInt();
        int recursiveSum = calculateSumRecursive(number);
        int formulaSum = calculateSumFormula(number);
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
    }
}