package javaControlFlow.Level1;
import java.util.Scanner;
public class CountdownForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = scanner.nextInt();
        for(int i = number;i>=1;i--){
            System.out.println(i);
        }
    }

}
