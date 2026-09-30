package javaStrings.Extras.builtInFunctionsPractices;
import java.util.Scanner;
// To find the factorial of the number given by the user
public class Factorial {
    //recursive method
    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return Math.multiplyExact(number, calculateFactorial(number - 1));
    }
    public static void main(String[] args) {
        //taking input in main
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("invalid number");
        } else {
            System.out.println("Factorial: " + calculateFactorial(number));

        }
    }
}