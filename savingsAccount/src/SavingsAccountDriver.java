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

        // Loop through months 0 to 12
        for (int month = 0; month <= 12; month++) {

            if (month == 0) {
                System.out.printf("%d\t%d\t\t%.2f\t\t%d\t\t%.2f%n",
                        month, saver1.getAccountNumber(), saver1.getBalance(),
                        saver2.getAccountNumber(), saver2.getBalance());
            } else {
                // Add interest only after the first month
                saver1.addMonthlyInterest();
                saver2.addMonthlyInterest();

                System.out.printf("%d\t%d\t\t%.2f\t\t%d\t\t%.2f%n",
                        month, saver1.getAccountNumber(), saver1.getBalance(),
                        saver2.getAccountNumber(), saver2.getBalance());
            }
        }
    }
}
