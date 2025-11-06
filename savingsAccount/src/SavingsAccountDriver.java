public class SavingsAccountDriver {
    public static void main(String[] args) {

        // Create the two objects/accounts
        SavingsAccount saver1 = new SavingsAccount(10002, 2000.00);
        SavingsAccount saver2 = new SavingsAccount(10003, 3000.00);

        // Set annual interest rate
        SavingsAccount.setAnnualInterestRate(0.05);

        // Print table heading using \t for better spacing
        System.out.println("Monthly balances for one year with 0.05 annual interest:\n");
        System.out.println("Month\tAccount #\tBalance\t\tAccount #\tBalance");
        System.out.println("-----\t---------\t-------\t\t---------\t-------");

    }
}
