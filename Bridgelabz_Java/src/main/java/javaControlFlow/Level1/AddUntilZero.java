package javaControlFlow.Level1;
import java.util.Scanner;

public class AddUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        double sum = 0;
        while (number != 0) {
            sum += number;
            System.out.println("Enter a number: ");
             number = scanner.nextDouble();

        }
        System.out.println(sum);
    }
}
