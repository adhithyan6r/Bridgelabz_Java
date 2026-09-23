package javaControlFlow.Level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        for(int i=6;i<=9;i++){
            int multiplication = number*i;
            System.out.println(number+" x "+i+" = "+multiplication);
        }
    }
}
