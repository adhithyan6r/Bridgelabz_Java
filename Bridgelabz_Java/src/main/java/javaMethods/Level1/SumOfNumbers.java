package javaMethods.Level1;
import java.util.Scanner;
public class SumOfNumbers {
    public static int calculateSum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = calculateSum(number);
        System.out.println("Sum of natural numbers: " + sum);
    }
}