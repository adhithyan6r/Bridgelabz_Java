import java.util.Scanner;
public class quotientAndReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The quotient is: " + quotient+" and the remainder is: " + remainder+" of two numbers "+num1+" and "+num2);
    }
}
