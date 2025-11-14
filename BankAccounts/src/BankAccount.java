public abstract class BankAccount {

    // Instance variable
    protected double balance;

    // Constructor
    public BankAccount(double balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

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