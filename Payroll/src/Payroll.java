import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of employees: ");
        int numEmployees = input.nextInt();
        input.nextLine();

        Employee[] employees = new Employee[numEmployees];

        // Ask for Employee Profiles
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nPROFILE FOR EMPLOYEE #" + (i + 1) + ":");
            System.out.print("Type Hourly(1), Salaried(2), Salaried plus Commission(3): ");
            int type = input.nextInt();
            input.nextLine();

            switch (type) {
                case 1:
                    employees[i] = new Hourly();
                    break;
                case 2:
                    employees[i] = new Salaried();
                    break;
                case 3:
                    employees[i] = new SalariedPlusCommission();
                    break;
                default:
                    System.out.println("Invalid type. Defaulting to Hourly.");
                    employees[i] = new Hourly();
            }

            employees[i].load(); // load data for this employee
        }

        // Payroll Report
        System.out.println("\nPAYCHECK REPORT:\n");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
            System.out.printf("Paycheck: $%.2f%n%n", emp.getEarnings());
        }

        input.close();
    }
}
