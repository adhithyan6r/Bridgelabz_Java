import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time: ");
        double time = scanner.nextDouble();
        double interest = (principal * rate * time) / 100;
        System.out.println("The simple interest is " + interest+ " for principal " + principal + ", rate " + rate + " and time " + time);
    }
}
