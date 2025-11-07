/************************************************************************
 * NewCar.java
 * Author: Joe Goode
 * 
 * This class extends Car and adds a colour variable.
 * It includes a constructor, an equals() method to compare two NewCar
 * objects, and a display() method that prints the price and colour.
 ***********************************************************************/
public class NewCar extends Car {
    private String color;

    // 2-param constructor
    public NewCar(double cost, String color) {
        super(cost); // calls the Car constructor
        this.color = color;
    }

    // Equals method
    public boolean equals(NewCar otherCar) {
        return this.getPrice() == otherCar.getPrice() &&
                this.color.equalsIgnoreCase(otherCar.color);
    }

    // Display method
    public void display() {
        System.out.printf("price = $%.2f, color = %s%n", getPrice(), color);
    }
}