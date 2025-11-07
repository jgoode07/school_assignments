public class UsedCar extends Car {
    private int mileage;

    // 2-param constructor
    public UsedCar(double cost, int mileage) {
        super(cost); // call to Car constructor
        this.mileage = mileage;
    }

    // Equals method
    public boolean equals(UsedCar otherCar) {
        return this.getPrice() == otherCar.getPrice() &&
                this.mileage == otherCar.mileage;
    }

    // Display method
    public void display() {
        System.out.printf("price = $%.2f, mileage = %,d%n", getPrice(), mileage);
    }
}
