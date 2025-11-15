
/**********************************************************
 * Savings.java
 * Author: Joe Goode
 *
 * Savings account class. Stores an interest rate and can
 * add interest to the balance. Prints the balance.
 **********************************************************/
import java.text.NumberFormat;

public class Savings extends BankAccount {

    // Interest rate
    private double intRate;

    // Constructor
    public Savings(double balance, double intRate) {
        super(balance);
        this.intRate = intRate;
    }

    public void addInterest() {
        double interest = balance * intRate;
        balance += interest;

        if (balance < 0) {
            balance = 0;
        }
    }

    // Display method using NumberFormat
    @Override
    public void display() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Savings account balance = " + currency.format(balance));
    }
}
