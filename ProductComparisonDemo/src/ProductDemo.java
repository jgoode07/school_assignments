public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99, 12345);
        // System.out.println("Product created successfully!");
        Product product2 = new Product("Laptop", 999.99, 12345);
        System.out.println(product1.equals(product2)); // Prints "false"
    }
}
