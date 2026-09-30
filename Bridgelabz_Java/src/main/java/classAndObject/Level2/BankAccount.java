package classAndObject.Level2;
import java.util.Scanner;
// Class to store bank account details and perform ATM operations
public class BankAccount {
    String accountHolder = "";
    long accountNumber = 0;
    double balance = 0;
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account1 = new BankAccount();
        System.out.print("Enter account1 holder name: ");
        account1.accountHolder = scanner.nextLine();
        System.out.print("Enter account1 number: ");
        account1.accountNumber = scanner.nextLong();
        System.out.print("Enter initial balance: ");
        account1.balance = scanner.nextDouble();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display balance");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter deposit amount: ");
                account1.deposit(scanner.nextDouble());
                break;
            case 2:
                System.out.print("Enter withdrawal amount: ");
                account1.withdraw(scanner.nextDouble());
                break;
            case 3:
                account1.displayBalance();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}