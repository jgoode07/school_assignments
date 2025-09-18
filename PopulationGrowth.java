import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Population Growth program.");

        System.out.print("Please enter the starting number of organisms (2 or more): ");
        double startingNum = scnr.nextDouble();
        if (startingNum < 2) {
            System.out.println("Invalid input. Starting number must be 2 or more.");
            return;
        }

        System.out.print("What is the daily increase of population in percentage (positive only): ");
        int dailyGrowth = scnr.nextInt();
        if (dailyGrowth < 0) {
            System.out.println("Invalid input. Daily increase must be 0 or more.");
            return;
        }

        System.out.print("How many days will the population multiply for? ");
        int numOfDays = scnr.nextInt();
        if (numOfDays < 1) {
            System.out.println("Invalid input. Number of days must be 1 or more.");
            return;
        }

        System.out.println("\nPopulation growth over " + numOfDays + " days:");
        double population = startingNum;
        for (int i = 1; i <= numOfDays; i++) {
            System.out.println("Day " + i + ": " + String.format("%.2f", population) + " organisms");
            population += population * dailyGrowth / 100.0;
        }
    }
}
