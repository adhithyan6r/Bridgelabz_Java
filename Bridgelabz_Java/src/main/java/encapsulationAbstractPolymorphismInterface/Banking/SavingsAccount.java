package encapsulationAbstractPolymorphismInterface.Banking;
// Class to represent a savings account
public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(long accountNumber, String holderName,
                          double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}