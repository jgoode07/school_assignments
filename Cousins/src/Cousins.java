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
            // Inner loop, for each kid
            for (int j = 0; j < cousins[i].length; j++) {
                System.out.print(cousins[i][j] + " ");
            }
        }
    } // end Main
} // end class Cousins