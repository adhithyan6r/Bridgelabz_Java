package encapsulationAbstractPolymorphismInterface.Banking;
import java.util.ArrayList;
// Class to run the banking system
public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount =
                new SavingsAccount(1001, "Adhi", 50000, 6.5);
        CurrentAccount currentAccount =
                new CurrentAccount(1002, "Rahul", 80000, 4.0);
        savingsAccount.deposit(5000);
        currentAccount.withdraw(10000);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);
        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println();
        }
    }
}