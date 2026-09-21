import java.util.Scanner;
public class intOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("enter second number: ");
        int c = scanner.nextInt();
        int p = a + b * c;
        int q = a * b + c;
        int r = c+a / b;
        int s = a % b + c;
        System.out.println("The result of int operations is: " + p + ", " + q + ", " + r + ", " + s);
    }
}
    