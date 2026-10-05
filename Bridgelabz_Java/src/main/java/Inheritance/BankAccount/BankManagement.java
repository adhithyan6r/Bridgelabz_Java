package Inheritance.BankAccount;
// Class to run the bank account hierarchy program
public class BankManagement {
    public static void main(String[] args) {
        SavingsAccount savingsAccount =
                new SavingsAccount(1001, 50000, 6.5);
        CheckingAccount checkingAccount =
                new CheckingAccount(1002, 30000, 10000);
        FixedDepositAccount fixedDepositAccount =
                new FixedDepositAccount(1003, 100000, 5);
        savingsAccount.displayAccountType();
        System.out.println();
        checkingAccount.displayAccountType();
        System.out.println();
        fixedDepositAccount.displayAccountType();
    }
}