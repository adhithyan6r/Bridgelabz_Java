package javaControlFlow.Level1;
import java.util.Scanner;
public class WhileFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number; ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Enter a number: ");
        }else{
            int factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}


