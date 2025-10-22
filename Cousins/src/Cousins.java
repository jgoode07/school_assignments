
/**********************************************************
 * Cousins.java
 * Author: Joe Goode
 *
 * This program stores groups of cousins in a 2D array
 * and prints each family on its own line using a for-each
 * loop.
 **********************************************************/

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
            if (cousins[i].length == 0) {
                continue; // Skip empty arrays
            }
            // Inner for each loop
            for (String kid : cousins[i]) {
                System.out.print(kid + " ");
            }
            System.out.println(); // new line after each row
        }
    } // end Main
} // end class Cousins