package Inheritance.BankAccount;
// Class to represent a checking account that inherits from BankAccount
public class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    public CheckingAccount(long accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}