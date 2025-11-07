public class CarDriver {
    public static void main(String[] args) {
        // Create two new cars
        NewCar new1 = new NewCar(8000.33, "silver");
        NewCar new2 = new NewCar(8000.33, "silver");

        // Compare and display if equal
        if (new1.equals(new2)) {
            new1.display();
        }

        // Create two used cars
        UsedCar used1 = new UsedCar(2500, 100000);
        UsedCar used2 = new UsedCar(2500, 100000);

        // Compare and display if equal
        if (used1.equals(used2)) {
            used1.display();
        }
    }
}
