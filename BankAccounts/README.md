MODULE 2, Assignment 4: Inheritance and Polymorphism - Bank Accounts
This assignment is taken from the instructor resources folder from the textbook: 

Instructions: 
1.	Write a bank account program that handles bank account balances for an array of bank accounts. There are two types of bank accounts ─ checking and savings. Use this UML class diagram:
  
 Implement the following classes and methods.
 BankAccount class:
 Instance variable:
balance
 
deposit method ─ add the given amount to the current balance.
 withdraw method ─ subtract the given amount from the current balance. Don’t allow the balance to go below zero. If the balance does go below zero, change the balance to zero.
 display method ─ This must be an abstract method.
 Checking class:
 	No new instance variables.
 writeACheck method ─ subtract the given amount from the current balance and then subtract an additional $1 as part of a service fee.
 display method ─ print the type of account, checking, and then the balance (with standard currency format). Study the output for details.
 Savings class:
 	Instance variable:
intRate (interest rate)
addInterest method ─ calculate the interest by multiplying the intRate by the current balance. Add the interest to the balance.
 display method ─ print the type of account, savings, and then the balance (with standard currency format).
2.	Provide appropriate constructors and additional methods as necessary. Study the given main method and output for details. Hint: Don’t allow the balance to go below zero. If the balance does go below zero, change the balance to zero.
3.	Provide a driver class that tests your three classes. Your driver class should contain this main method:
 public static void main(String[] args)
{
  BankAccount[] accounts = new BankAccount[100];
 
  accounts[0] = new Savings(1100, .05);
  accounts[0].deposit(100);
  accounts[0].withdraw(200);
  ((Savings) accounts[0]).addInterest();
 
  accounts[1] = new Checking(-100);
  accounts[1].deposit(50);
 
  accounts[2] = new Checking(200);
  accounts[2].withdraw(210);
  accounts[2].deposit(100);
  ((Checking) accounts[2]).writeACheck(50);
	
  for (int i=0; i<accounts.length && accounts[i] != null; i++)
  {
	accounts[i].display();
  }
} // end main
 
Output:
 
Savings account balance = $1,050.00
Checking account balance = $50.00
Checking account balance = $49.00

Reference: 
Dean, J. Dean, R. (2021).  Introduction to programming with java: a problem solving approach (3rd edition). McGraw-Hill Education.
