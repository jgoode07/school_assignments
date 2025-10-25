# Assignment 3 – Arrays Project

This project demonstrates how to work with arrays and basic object-oriented programming concepts in Java. I created a `Product` class to store product details, and a `ProductManager` class that uses different kinds of arrays — including 1D, copied arrays, sorted arrays, and a 2D matrix.

## What This Program Does
- Stores product information (name, ID, and a list of prices) using a `Product` class and an array of `Product` objects.
- Uses **for-each loops** to display the inventory and sales data.
- Generates **weekly sales** (40 random integers) and prints them.
- Copies weekly values into **three monthly arrays** (4 weeks each) to simulate a quarter.
- Calculates **average sales** with a helper method.
- Sorts a product’s prices in ascending order using a custom sorting method.
- Creates and prints a **5×5 matrix** with random numbers using nested loops.

## Methods I Implemented
- `findAverageSales(int[] sales)` – Loops through an array to calculate and return the average.
- `sortPrices(double[] prices)` – Uses a selection sort to reorder prices from smallest to largest.
- `toString()` override in `Product` – Makes printing the product details clean and readable.

## About .gitignore
On my instructor’s advice, I learned how to use a `.gitignore` file to keep my repository clean by ignoring compiled files like `/bin` and `.class`. This keeps GitHub limited to source code only. *(Thanks, Jo!)*

## How to Run
Compile and run `ProductManager.java`. The program will print all products, sales data, averages, sorted prices, and the 5×5 matrix output to the console.
