package javaControlFlow.Level1;

import java.util.Scanner;

public class ForFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number; ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Enter a number: ");
        }else{
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
