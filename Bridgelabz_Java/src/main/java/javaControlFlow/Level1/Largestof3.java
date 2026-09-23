package javaControlFlow.Level1;
import java.util.Scanner;

public class Largestof3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        double number2 = scanner.nextInt();
        System.out.println("Enter third number:");
        double number3 = scanner.nextInt();
        if(number1>number2 && number1>number2){
            System.out.println("is the first number the largest? Yes");
            System.out.println("is the second number the largest? No");
            System.out.println("is the third number the largest? No");
        } else if (number2>number1 && number2>number3) {
            System.out.println("is the first number the largest? No");
            System.out.println("is the second number the largest? Yes");
            System.out.println("is the third number the largest? No");
        }
        else{
            System.out.println("is the first number the largest? No");
            System.out.println("is the second number the largest? No");
            System.out.println("is the third number the largest? Yes");
        }
    }
}
