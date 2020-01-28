public class SavingsAccount extends Account {

    private double interestRate;

    // Constructor
    public SavingsAccount(int a, double rate) {
        super(a);
        interestRate = rate;
    }

    // Methods
    public void addInterest() {
        super.deposit(getBalance() *interestRate);
    }

}