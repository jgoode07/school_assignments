public class NewCar extends Car {
    private String color;

    // 2-param constructor
    public NewCar(double cost, String color) {
        super(cost); // calls the Car constructor
        this.color = color;
    }
}