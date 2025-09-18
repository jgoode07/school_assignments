import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Population Growth program.");
        System.out.print("Please enter the starting number of organisms (2 or more): ");
        int startingNum = scnr.nextInt();

        System.out.println("What is the daily increase of population in percentage (positive only): ");
        int dailyGrowth = scnr.nextInt();

    }
}
