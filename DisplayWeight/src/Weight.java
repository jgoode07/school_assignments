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

    public void setWeight(double w) {
        weight = w;
        units = "kg";
    }
}
