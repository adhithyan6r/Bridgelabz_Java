package encapsulationAbstractPolymorphismInterface.Banking;
// Class to represent a current account
public class CurrentAccount extends BankAccount {
    private double interestRate;
    public CurrentAccount(long accountNumber, String holderName,
                          double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}