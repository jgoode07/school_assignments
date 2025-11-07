/************************************************************************
 * Car.java
 * Author: Joe Goode
 * 
 * This class stores the base price for a car and includes a constructor
 * and a getPrice() method that returns the calculated price. Used as
 * the superclass for NewCar and UsedCar.
 ***********************************************************************/
public class Car {
    // Instance variable
    private double price;

    // 1-param Constructor
    public Car(double cost) {
        price = cost * 2;
    }

    // Accessor method
    public double getPrice() {
        return price;
    }
}
