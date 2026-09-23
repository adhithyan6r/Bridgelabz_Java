package javaControlFlow.Level1;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        double number= scanner.nextInt();
        if(number > 0){
            System.out.println("positive");
        }
        else if(number==0){
            System.out.println("zero");
        }
        else{
            System.out.println("negative");
        }
    }
}
