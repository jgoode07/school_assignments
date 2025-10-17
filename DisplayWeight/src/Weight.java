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

    public void setWeight(double w, String u) {
        weight = w;
        units = u;
    }
}
