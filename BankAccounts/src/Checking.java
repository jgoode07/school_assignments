import java.text.NumberFormat;

public class Checking extends BankAccount {

    // Constructor
    public Checking(double balance) {
        super(balance);
    }

    // writeACheck method
    public void writeACheck(double amount) {
        if (amount > 0) {
            balance -= amount; // Subtract amount
            balance -= 1; // Service fee

            if (balance < 0) {
                balance = 0;
            }
        }
    }

    // Display method
    @Override
    public void display() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Checking account balance = " + currency.format(balance));
    }
}
