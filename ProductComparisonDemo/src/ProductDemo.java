public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99, 12345);
        Product product2 = new Product("Laptop", 999.99, 12345);

        // Check for equality with equals()
        System.out.println("Both products are equal: " + product1.equals(product2)); // Prints "false"

        Product product3 = new Product("Tablet", 499.99, 12346);

        // Use both versions of the overloaded methods
        System.out.println("\nProduct 3 Info: ");
        product3.printProductInfo(false); // Prints Name and Price only

        System.out.println("\nProduct 3 Info:");
        product3.printProductInfo(true); // Prints Name, Price and Code
    }

}
