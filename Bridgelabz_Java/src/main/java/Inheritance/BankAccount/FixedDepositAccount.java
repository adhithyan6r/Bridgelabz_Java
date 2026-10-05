package Inheritance.BankAccount;
// Class to represent a fixed deposit account that inherits from BankAccount
public class FixedDepositAccount extends BankAccount {
    int depositPeriod;
    public FixedDepositAccount(long accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Fixed deposit account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Deposit Period: " + depositPeriod + " years");
    }
}