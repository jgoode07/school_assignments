
/*******************************************************
 * Employee.java
 * Author: Joe Goode
 *
 * Base class for all employees. 
 * Stores personal details and handles birthday bonuses.
 *******************************************************/

import java.util.Scanner;
import java.util.Calendar;

public abstract class Employee {

    // Instance variables
    protected String name;
    protected String socialSecurityNumber;
    protected int birthdayMonth;
    protected int birthdayWeek;

    public void load() {
        Scanner input = new Scanner(System.in);

        System.out.print("Name ==> ");
        name = input.nextLine();

        System.out.print("Social Security Number ==> ");
        socialSecurityNumber = input.nextLine();

        System.out.print("Birthday Month (1-12) ==> ");
        birthdayMonth = input.nextInt();

        System.out.print("Birthday Bonus Week (1-4) ==> ");
        birthdayWeek = input.nextInt();
    }

    @Override
    public String toString() {
        return String.format(
                "Employee: %s%n" +
                        "Social Security Number: %s",
                name,
                socialSecurityNumber);
    }

    public double getBonus(double paycheck) {
        // Create a Calendar object to get the current date
        Calendar currentDate = Calendar.getInstance();
        int currentMonth = currentDate.get(Calendar.MONTH) + 1;
        int currentWeek = currentDate.get(Calendar.WEEK_OF_MONTH);

        // If the employee’s birthday matches the current date, add $100
        if (birthdayMonth == currentMonth && birthdayWeek == currentWeek) {
            paycheck += 100;
            System.out.println("Birthday bonus added for " + name + "!");
        }

        // Return capped paycheck (cannot exceed $1000)
        if (paycheck > 1000) {
            paycheck = 1000;
        }

        return paycheck;
    }

    // Abstract method for subclasses
    public abstract double getEarnings();

}
