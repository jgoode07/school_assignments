/******************************************************
 * Product.java
 * Author: Joe Goode
 *
 * This class creates a product with a name, price,
 * and product code. It includes overloaded methods to
 * print product details and tracks how many products
 * have been created using a static variable.
 *****************************************************/

public class Product {
    private String name;
    private double price;
    private int productCode;
    private static int productCount = 0;
    public static final double TAX_RATE = 0.1; // 10% tax

    public Product(String name, double price, int productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        productCount++; // Count the objects that are created
    }

    public static int getProductCount() {
        return productCount;
    }

    // Getter method to access price in other classes
    public double getPrice() {
        return price;
    }

    public void printProductInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }

    // Overloaded version that takes a boolean parameter
    // The parameter (showCode) decides whether to include the product code
    public void printProductInfo(boolean showCode) {
        if (showCode) {
            System.out.println("Name: " + name);
            System.out.println("Price: $" + price);
            System.out.println("Product Code: " + productCode);
        } else {
            printProductInfo(); // Calls the first version w/o product code
        }
    }
}
