package javaControlFlow.Level1;
import java.util.Scanner;

public class CountdownTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        while(number>=1){
            System.out.println(number);
            number--;
        }
    }
}
