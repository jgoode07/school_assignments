import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(Scanner.in);

        System.out.println("Welcome to the Java Calculator Program.");
        System.out.println("Which operation would you like to perform? (+, -, *. pow, sqrt)");
        String operatorType = scnr.nextLine();
    }
}
