package javaControlFlow.Level1;
import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to check: ");
        double number= scanner.nextInt();
        if(number%5 == 0){
            System.out.println("is the number "+number+"divisible by 5? Yes");
        }
        else{
            System.out.println("is the number "+number+"divisible by 5? No");
        }
    }

}
