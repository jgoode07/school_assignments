# Savings Account Comparison

## Author
Joseph Goode — November 6th, 2025

## Overview
This project compares the monthly balances of two savings accounts over one year.  
Each account earns interest based on a shared annual rate (0.05), and the program calculates  
and displays the balance for each month, followed by the final combined total of both accounts.

## Features
- Creates two individual `SavingsAccount` objects  
- Uses a shared static interest rate to simulate aggregation  
- Prints formatted monthly balances with `printf`  
- Displays the final combined balance after 12 months  

## Files
- **SavingsAccount.java** – Handles the setup for each account, including the balance,  
  account number, and how monthly interest is added.
- **SavingsAccountDriver.java** – The main program that creates two accounts,  
  sets the interest rate, and prints the monthly balances and final total.

## How to Run
1. Compile both files:
   ```bash
   javac SavingsAccount.java SavingsAccountDriver.java
   
2. Run the driver program:
    ```bash
   java SavingsAccountDriver

## Output Example
```
Monthly balances for one year with 0.05 annual interest:

Month	Account#	Balance		Account#	Balance
-----	---------	-------		---------	-------
0	    10002		2000.00		10003		3000.00
1	    10002		2008.33		10003		3012.50
...
12	    10002		2123.47		10003		3185.21

Final balance of both accounts combined: 5308.68