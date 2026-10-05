package Inheritance.BankAccount;
// Class to represent a savings account that inherits from BankAccount
public class SavingsAccount extends BankAccount {
    double interestRate;
    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountType() {
        System.out.println("Account type: Savings Account");
        System.out.println("Account nmber: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate + "%");
    }
}