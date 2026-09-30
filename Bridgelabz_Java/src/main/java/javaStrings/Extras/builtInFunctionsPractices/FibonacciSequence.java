package javaStrings.Extras.builtInFunctionsPractices;
import java.util.Scanner;
//program to generata a fibonacci sequence
public class FibonacciSequence {
    public static void generateFibonacci(int terms) {
        int first = 0;
        int second = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            if (i < terms) {
                try {
                    int next = Math.addExact(first, second);
                    first = second;
                    second = next;
                } catch (ArithmeticException e) {
                    System.out.println("\nInteger limit reached");
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();
        if (terms <= 0) {
            System.out.println("Enter a anumber");
        } else {
            generateFibonacci(terms);
        }
    }
}