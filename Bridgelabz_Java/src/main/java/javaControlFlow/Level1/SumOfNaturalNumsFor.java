package javaControlFlow.Level1;
import java.util.Scanner;
public class SumOfNaturalNumsFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number");
        } else {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            int sumUsingFormula = n * (n + 1) / 2;
            System.out.println("For loop: " + sum);
            System.out.println("Formula: " + sumUsingFormula);
        }
    }
}
