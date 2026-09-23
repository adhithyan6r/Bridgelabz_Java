package javaControlFlow.Level2;
import java.util.Scanner;
public class AgeHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Amar's height; ");
        double amarHeight = scanner.nextDouble();
        System.out.print("Enter Akbars age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Akbar's height: ");
        double akbarHeight = scanner.nextDouble();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = scanner.nextDouble();
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest friend: Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest friend: Akbar");
        } else {
            System.out.println("Youngest friend: Anthony");
        }
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest friend: Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest friend: Akbar");
        } else {
            System.out.println("Tallest friend: Anthony");
        }
    }
}