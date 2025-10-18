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
}
