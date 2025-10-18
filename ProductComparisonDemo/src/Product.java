public class Product {
    private String name;
    private double price;
    private int productCode;

    public Product(String name, double price, int productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
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
