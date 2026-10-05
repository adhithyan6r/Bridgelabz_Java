package thisStaticFinal;
// Class to manage bank accounts using static, this, final and instanceof
public class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;
    String accountHolderName;
    final long accountNumber;
    public BankAccount(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Adhi", 1001);
        BankAccount account2 = new BankAccount("Udhay", 1002);
        if (account1 instanceof BankAccount) {
            account1.displayDetails();
        }
        if (account2 instanceof BankAccount) {
            account2.displayDetails();
        }
        BankAccount.getTotalAccounts();
    }
}