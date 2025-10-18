# Product Demo Program

**Author:** Joe Goode  
**Course:** Object-Oriented Programming  
**Instructor:** Joanne Hoar  
**Date:** October 17th, 2025  


## Overview

This project is for Assignment 2 in Object-Oriented Programming.  
It includes two Java files:

- **Product.java** – class for product details (name, price, product code), product counter, and methods to show info.
- **ProductDemo.java** – creates product objects, runs methods, and prints everything in the console.


## What This Covers

- Creating objects from a custom class  
- Overloaded methods (`printProductInfo`)  
- Static variables and constants (`productCount`, `TAX_RATE`)  
- Comparing two objects with `.equals()`  

## Example Output

This is what shows in the console when the program runs:

```Product 1 Information:
Name: Laptop
Price: $999.99
Product Code: 12345

Product 2 Information:
Name: Laptop
Price: $999.99
Product Code: 12345

Product 1 and Product 2 are equal: false

Product 3 Information:
Name: Tablet
Price: $299.99
Product Code: 54321

Product 3 Information (with code):
Tablet, $299.99, Product Code: 54321

Total Product Count: 4
Tax Amount for Product 1: $99.99
