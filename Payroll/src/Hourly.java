
/******************************************************
 * Hourly.java
 * Author: Joe Goode
 *
 * Represents an hourly employee.
 * Calculates pay based on hours worked and overtime.
 ******************************************************/

import java.util.Scanner;

public class Hourly extends Employee {

    // Instance variables
    private double hourlyPay;
    private double hoursWorked;

    @Override
    public void load() {
        Scanner input = new Scanner(System.in);

        // Call the parent class load() to get employee data
        super.load();

        System.out.print("Hourly pay ==> ");
        hourlyPay = input.nextDouble();

        System.out.print("Hours worked this past week ==> ");
        hoursWorked = input.nextDouble();
    }

    public double getEarnings() {
        double earnings;

        // Calculate normal and overtime pay
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            earnings = (40 * hourlyPay) + (overtimeHours * hourlyPay * 1.5);
        } else {
            earnings = hoursWorked * hourlyPay;
        }

        // Cap paycheck at $1000
        if (earnings > 1000) {
            earnings = 1000;
        }

        // Add birthday bonus (if applicable)
        earnings = getBonus(earnings);

        return earnings;
    }
}
