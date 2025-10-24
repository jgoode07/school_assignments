public class Product {
    private String productName;
    private int productId;
    private double[] prices;

    public Product(String productName, int productId, double[] prices) {
        this.productName = productName;
        this.productId = productId;
        this.prices = prices;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public int productId() {
        return productId;
    }

    public double getPrices() {
        return prices;
    }
}
