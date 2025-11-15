# Bank Accounts  
**Author:** Joe Goode  
**Course:** Structured Programming with Java: Inheritance and Polymorphism

## Overview
This program shows how inheritance works in Java by creating three classes:
- `BankAccount` (abstract base class)
- `Checking` (child class)
- `Savings` (child class)

Each account can deposit and withdraw money, and each subclass has its own extra feature:
- Checking accounts can write a check (subtracts amount + $1 fee)
- Savings accounts can add interest

## How It Works
The `BankAccountDriver` class creates an array of `BankAccount` objects and runs a few
operations on them using deposits, withdrawals, interest, and check writing.  
At the end, each account prints its final balance.

## Files Included
- `BankAccount.java`
- `Checking.java`
- `Savings.java`
- `BankAccountDriver.java`

## Expected Output
```
Savings account balance = $1,050.00
Checking account balance = $50.00
Checking account balance = $49.00