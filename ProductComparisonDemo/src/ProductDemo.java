public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99, 12345);
        Product product2 = new Product("Laptop", 999.99, 12345);

        // Check for equality with equals()
        System.out.println("Product 1 and 2 are equal: " + product1.equals(product2)); // Prints "false"

        Product product3 = new Product("Tablet", 499.99, 12346);

        // Use both versions of the overloaded methods
        System.out.println("\nProduct 3 Info: ");
        product3.printProductInfo(false); // Prints Name and Price only

        System.out.println("\nProduct 3 Info:");
        product3.printProductInfo(true); // Prints Name, Price and Code

        // Fourth product
        Product product = new Product("Monitor", 199.99, 23456);

        // Show how many objects are created
        System.out.println("Total Product Count: " + Product.getProductCount());

        // Tax calculation using final constant from Product class
        double taxAmount = product1.getPrice() * Product.TAX_RATE;
        System.out.println("Tax Amount for Product 1: $" + taxAmount);
    }

}
