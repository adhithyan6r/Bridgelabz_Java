package javaConstructors.AccessModifiers;
// Class to manage bank account details and demonstrate access modifiers
class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
// Class to demonstrate protected member access
class SavingsAccount extends BankAccount {
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}
// Class to run the bank management program
public class BankManagement {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.accountNumber = 123456789;
        account.accountHolder = "Adhi";
        account.setBalance(25000);
        account.display();
    }
}