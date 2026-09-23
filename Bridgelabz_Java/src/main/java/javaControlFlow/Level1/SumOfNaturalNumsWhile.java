package javaControlFlow.Level1;
import java.util.Scanner;
public class SumOfNaturalNumsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("invalid number");
        } else {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum = sum + i;
                i++;
            }
            int sumUsingFormula = n * (n + 1) / 2;
            System.out.println("while loop: " + sum);
            System.out.println("formula: " + sumUsingFormula);
        }
    }
}


