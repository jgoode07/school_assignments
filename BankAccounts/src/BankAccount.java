public abstract class BankAccount {

    // Instance variable
    protected double balance;

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw money (cannot go below 0)
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            if (balance < 0) {
                balance = 0;
            }
        }
    }

    // Abstract display method (to be defined in subclasses)
    public abstract void display();
}