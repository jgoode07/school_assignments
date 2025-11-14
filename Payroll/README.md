# Payroll Program

**Author:** Joe Goode  
**Course:** Structured Programming with Java  
**Assignment:** Module 2 – Inheritance and Polymorphism

## Overview
This program calculates and prints the weekly payroll for a company using inheritance and polymorphism.  
It supports three employee types:
- **Hourly:** Paid hourly with overtime for more than 40 hours.  
- **Salaried:** Paid a fixed weekly amount.  
- **SalariedPlusCommission:** Paid a base salary plus a percentage of weekly sales.  

If any employee’s calculated paycheck exceeds **$1000**, it is capped at that amount.  
Employees also receive a **$100 birthday bonus** when their birthday month and week match the current system date.

## How to Run
1. Compile all `.java` files:
   ```bash
   javac *.java
2. Run the program:
   ```
   java Payroll
3. Follow the prompts to enter employee information.
    ```
    PAYCHECK REPORT:

    Employee: Biff Sanchez
    Social Security Number: 111-11-1111
    Paycheck: $600.00

    Employee: Dirk Jones
    Social Security Number: 222-22-2222
    Paycheck: $800.00

    Employee: Suzie Que
    Social Security Number: 333-33-3333
    Paycheck: $900.00

## Notes

The program uses the Calendar class to determine the current month and week.

All classes include a load() method for user input and a getEarnings() method for calculating pay.
