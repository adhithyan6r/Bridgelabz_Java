package javaControlFlow.Level3;
import java.util.Scanner;
public class HarshadNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int i = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        if (i % sum == 0) {
            System.out.println(i + " is a Harshad Number");
        } else {
            System.out.println(i + " is not a Harshad Number");
        }

        scanner.close();
    }
}