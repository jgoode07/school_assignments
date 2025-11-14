import java.util.Scanner;

public class Salaried extends Employee {

    // Instance variable
    private double weeklySalary;

    @Override
    public void load() {
        Scanner input = new Scanner(System.in);

        // Call parent class load()
        super.load();

        System.out.print("Weekly salary ==> ");
        weeklySalary = input.nextDouble();
    }

    public double getEarnings() {
        double earnings = weeklySalary;

        // Cap paycheck at $1000
        if (earnings > 1000) {
            earnings = 1000;
        }

        // Add birthday bonus (if applicable)
        earnings = getBonus(earnings);

        return earnings;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

}
