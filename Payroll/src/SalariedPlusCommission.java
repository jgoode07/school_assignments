import java.util.Scanner;

public class SalariedPlusCommission extends Salaried {

    // Instance variables
    private double sales;
    private double commissionRate;

    @Override
    public void load() {
        Scanner input = new Scanner(System.in);

        // Call parent class load() first
        super.load();

        System.out.print("Sales for this past week ==> ");
        sales = input.nextDouble();

        System.out.print("Sales commission rate (fraction paid to employee) ==> ");
        commissionRate = input.nextDouble();
    }

    @Override
    public double getEarnings() {
        double earnings = (sales * commissionRate) + getWeeklySalary();

        // Cap paycheck at $1000
        if (earnings > 1000) {
            earnings = 1000;
        }

        // Add birthday bonus if applicable
        earnings = getBonus(earnings);

        return earnings;
    }
}
