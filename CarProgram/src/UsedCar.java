public class UsedCar extends Car {
    private int mileage;

    // 2-param constructor
    public UsedCar(double cost, int mileage) {
        super(cost); // call to Car constructor
        this.mileage = mileage;
    }
}
