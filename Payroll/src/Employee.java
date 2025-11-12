import java.util.Scanner;

public class Employee {
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
                        "Social Security Number: %s%n" +
                        "Paycheck: $%.2f%n",
                name,
                socialSecurityNumber,
                0.00); // Temp placeholder for paycheck
    }
}
