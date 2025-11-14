import java.util.Scanner;

public class Hourly extends Employee {

    // Instance variables
    private double hourlyPay;
    private double hoursWorked;

    // load method
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
}
