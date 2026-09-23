package javaControlFlow.Level3;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int i = number;
        int sum = 0;
        while (i != 0) {
            int digit = i % 10;
            sum = sum + (digit * digit * digit);
            i = i / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}