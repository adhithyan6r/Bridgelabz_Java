package javaMethods.Level1;
import java.util.Scanner;
public class PositiveNegativeZero {
    public static int checkNumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = checkNumber(number);
        if (result == 1) {
            System.out.println("positive");
        } else if (result == -1) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}