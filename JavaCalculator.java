import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Java Calculator Program.");
        System.out.println("Which operation would you like to perform? (+, -, *. pow, sqrt)");
        String operatorType = scnr.nextLine();

        switch (operatorType) {
            case "+":
                System.out.print("Enter the two numbers you'd like added:");
                int add1 = scnr.nextInt();
                int add2 = scnr.nextInt();
                int addTotal = add1 + add2;
                System.out.println("The result is: " + addTotal);
                break;
        }
    }
}
