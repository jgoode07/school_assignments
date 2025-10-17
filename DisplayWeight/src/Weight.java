/************************************
 * Weight.java
 * Author: Joe Goode
 * 
 * Creates a simple Weight class with
 * constructors and methods to set
 * and display weight.
 ************************************/

public class Weight {
    private double weight;
    private String units;

    // Set a default zero parameter constructor
    public Weight() {
        weight = 0;
        units = "kg";
    }

    // One param constructor
    public Weight(double w) {
        setWeight(w);
    }

    // Two param constructor
    public Weight(double w, String u) {
        setWeight(w, u);
    }

    // Setters
    public void setWeight(double w) {
        weight = w;
        units = "kg";
    }

    // Added a simple check so only "kg" or "lbs" are accepted,
    // otherwise it defaults to "kg"
    public void setWeight(double w, String u) {
        if (u.equals("kg") || u.equals("lbs")) {
            weight = w;
            units = u;
        } else {
            System.out.println("Invalid unit, defaulting to kg.");
            weight = w;
            units = "kg";
        }
    }

    // Print method with printf to format value without decimal
    public void print() {
        System.out.printf("%.0f %s%n", weight, units);
    }
}
