import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Population Growth program.");

        System.out.print("Please enter the starting number of organisms (2 or more): ");
        double startingNum = scnr.nextDouble();

        System.out.print("What is the daily increase of population in percentage (positive only): ");
        int dailyGrowth = scnr.nextInt();

        System.out.print("How many days will the population multiply for? ");
        int numOfDays = scnr.nextInt();

        if (startingNum < 2 || dailyGrowth < 0 || numOfDays < 1) {
            System.out.println("Invalid input. Please follow the instructions properly.");
            return;
        }

    }
}
