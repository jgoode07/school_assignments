import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Java Calculator Program.");

        boolean anotherOne = true;

        while (anotherOne) {

            System.out.print("Which operation would you like to perform? (+, -, *. pow, sqrt): ");
            String operatorType = scnr.nextLine();

            switch (operatorType) {
                case "+":
                    System.out.print("Enter the two numbers you'd like added: ");
                    int add1 = scnr.nextInt();
                    int add2 = scnr.nextInt();
                    int addTotal = add1 + add2;
                    System.out.println("The result is: " + addTotal);
                    break;

                case "-":
                    System.out.print("Enter the two numbers you'd like subtracted: ");
                    int sub1 = scnr.nextInt();
                    int sub2 = scnr.nextInt();
                    int subTotal = sub1 - sub2;
                    System.out.println("The result is: " + subTotal);
                    break;

                case "*":
                    System.out.print("Enter the two numbers you'd like multiplied: ");
                    int multi1 = scnr.nextInt();
                    int multi2 = scnr.nextInt();
                    int multiTotal = multi1 * multi2;
                    System.out.println("The result is: " + multiTotal);
                    break;

                case "pow":
                    System.out.print("Enter the base number: ");
                    int base = scnr.nextInt();

                    System.out.print("Enter the exponent you want to raise it to: ");
                    int exponent = scnr.nextInt();

                    double powTotal = Math.pow(base, exponent);
                    System.out.println("The result is: " + powTotal);
                    break;

                case "sqrt":
                    System.out.print("Enter the number you want the square root of: ");
                    int sqrtNum = scnr.nextInt();

                    double sqrtTotal = Math.sqrt(sqrtNum);
                    System.out.println("The result is: " + sqrtTotal);
                    break;

                default:
                    System.out.println("Invalid option, please enter a valid operator.");
                    break;
            }

            System.out.print("Would you like to do another calculation? (yes/no): ");
            scnr.nextLine();
            String again = scnr.nextLine();

            if (!again.equalsIgnoreCase("yes")) {
                anotherOne = false;
                System.out.println("Thanks for using the Java Calculator!");
            }
        }
    }
}
