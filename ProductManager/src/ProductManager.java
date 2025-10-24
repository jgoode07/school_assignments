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
    }
}