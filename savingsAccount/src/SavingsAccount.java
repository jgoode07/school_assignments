/******************************************************************
 * SavingsAccount.java
 * 
 * Author: Joseph Goode
 * Date: November 6th, 2025
 * 
 * This class represents a savings account with an account number,
 * balance, and a shared annual interest rate. It includes methods
 * to calculate and apply monthly interest to each account balance.
 ******************************************************************/
public class SavingsAccount {
    private static double annualInterestRate;
    private final int ACCOUNT_NUMBER;
    private double balance;

    // Constructor
    public SavingsAccount(int accountNumber, double initialBalance) {
        this.ACCOUNT_NUMBER = accountNumber;
        this.balance = initialBalance;
    }

    // Accessor Methods
    public int getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    public double getBalance() {
        return balance;
    }

    // Class method to set the interest rate
    public static void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    // Method to add monthly interest
    public void addMonthlyInterest() {
        balance += balance * annualInterestRate / 12;
    }
}
