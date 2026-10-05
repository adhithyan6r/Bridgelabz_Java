package Inheritance.BankAccount;
// Class torepresent common details of all bank accounts
public class BankAccount {
    long accountNumber;
    double balance;
    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccount() {
        System.out.println("account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}