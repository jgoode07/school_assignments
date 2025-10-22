import java.util.Arrays;

public class Cousins {

    public static void main(String[] args) {
        String[] bradKids = { "Maddy", "Ross", "Henry" };
        String[] jayKids = { "Brian", "Kevin", "Kristin" };
        String[] annKids = {};
        String[] libbyKids = { "Ellie", "Hanna", "Jack", "Ben" };
        String[][] cousins = { bradKids, jayKids, annKids, libbyKids };

        // <insert code here>
        System.out.println("Cousins:\n");

        // Loop through the outer loop (families)
        for (int i = 0; i < cousins.length; i++) {
            // Inner for each loop
            for (String kid : cousins[i]) {
                System.out.print(kid + " ");
            }
        }
    } // end Main
} // end class Cousins