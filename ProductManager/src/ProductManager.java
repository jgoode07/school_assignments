import java.util.Arrays;
import java.util.Random;

public class ProductManager {
    public static void main(String[] args) {
        Product[] inventory = new Product[] {
                new Product("Laptop", 1001,
                        new double[] { 899.99, 949.99, 999.99, 899.99, 949.99, 999.99, 849.99, 899.99, 949.99,
                                999.99 }),
                new Product("Phone", 1002,
                        new double[] { 599.99, 649.99, 699.99, 749.99, 699.99, 749.99, 799.99, 849.99, 799.99,
                                849.99 }),
                new Product("Tablet", 1003, new double[] { 299.99, 349.99, 399.99, 299.99, 349.99, 399.99 }),
                new Product("Monitor", 1004, new double[] { 199.99, 179.99, 189.99, 209.99 }),
                new Product("Keyboard", 1005, new double[] { 49.99, 39.99, 44.99, 49.99 }),
                new Product("Mouse", 1006, new double[] { 24.99, 19.99, 29.99, 24.99 }),
                new Product("Headset", 1007, new double[] { 89.99, 79.99, 99.99, 89.99 }),
                new Product("Charger", 1008, new double[] { 19.99, 14.99, 17.99 }),
                new Product("SSD", 1009, new double[] { 129.99, 119.99, 139.99 }),
                new Product("Webcam", 1010, new double[] { 69.99, 59.99, 64.99 })
        };
        // For each loop prints each item in the array
        System.out.println("Products:");
        for (Product p : inventory) {
            System.out.println();
            System.out.println(p);
        }

        // Weekly sales (capacity 40)
        int[] weeklySales = new int[40];
        Random range = new Random();

        // Fill weekly sales with random values between 50 and 200
        for (int i = 0; i < weeklySales.length; i++) {
            weeklySales[i] = 50 + range.nextInt(151);
        }

        // Display weeklySales with a for-each loop
        System.out.println("\nWeekly Sales:");
        for (int sale : weeklySales) {
            System.out.print(sale + " ");
        }
        System.out.println(); // New line for cleaner output

        // PART 2: Monthly Sales (3 arrays of 4 weeks)
        int[] month1 = new int[4];
        int[] month2 = new int[4];
        int[] month3 = new int[4];

        // Copy weeks into each month
        for (int i = 0; i < 4; i++) {
            month1[i] = weeklySales[i]; // Weeks 0-3
            month2[i] = weeklySales[i + 4]; // Weeks 4-7
            month3[i] = weeklySales[i + 8]; // Weeks 8-11
        }

        // Display monthly sales using for-each loops
        System.out.println("\nMONTHLY SALES:");
        System.out.print("Month 1: ");
        for (int sale : month1) {
            System.out.print(sale + " ");
        }
        System.out.println();

        System.out.print("Month 2: ");
        for (int sale : month2) {
            System.out.print(sale + " ");
        }
        System.out.println();

        System.out.print("Month 3: ");
        for (int sale : month3) {
            System.out.print(sale + " ");
        }
        System.out.println();

        // Print average sales for the month called
        double avgMonth2 = findAverageSales(month2);
        System.out.printf("%nAverage Sales for Month 2: %.2f%n", avgMonth2);

        // Part 3b: Sort and display prices for the first product
        sortPrices(inventory[0].getPrices());
        System.out.println("\nSorted Prices:");
        System.out.println(Arrays.toString(inventory[0].getPrices()));

    }

    // Part 3: helper method to calculate average sales of the month
    public static double findAverageSales(int[] sales) {
        int total = 0;
        for (int num : sales) {
            total += num;
        }
        return (double) total / sales.length;
    }

    // Sorts the given price array
    public static void sortPrices(double[] prices) {

        // Move the smallest value to the right spot each loop
        for (int i = 0; i < prices.length - 1; i++) {
            int smallestIndex = i;

            // Find the smallest value in the rest of the array
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            double temp = prices[i];
            prices[i] = prices[smallestIndex];
            prices[smallestIndex] = temp;
        }
    }
}