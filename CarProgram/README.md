MODULE 1, Assignment 2: Aggregation and Composition - Car Program

Instructions: 
Your uncle is trying to keep track of his new-car and used-car lots by writing a Java program. He needs your help in setting up his classes.
1.	Implement a superclass named Car that contains a price instance variable, a getPrice method, and a 1-parameter constructor. 
2.	The getPrice method is a simple accessor method that returns the price instance variable’s value. 
3.	The 1-parameter constructor receives a cost parameter and assigns a value to the price instance variable based on this formula:
 	price = cost * 2;
4.	Implement two classes named NewCar and UsedCar; they are both derived from the Car superclass. NewCar should contain a color instance variable (the car’s color). UsedCar should contain a mileage instance variable (the car’s odometer reading). 
5.	The NewCar and UsedCar classes should each contain a 2-parameter constructor, an equals method, and a display method. In the interest of elegance and maintainability, don’t forget to have your subclass constructors call your superclass constructors when appropriate. The display method should print the values of all the instance variables within its class.
6.	Provide a driver class that tests your three car classes. Your driver class should contain this main method:
public static void main(String[] args)
{
  NewCar new1 = new NewCar(8000.33, "silver");
  NewCar new2 = new NewCar(8000.33, "silver");
  if (new1.equals(new2))
  {
	new1.display();
  }
  UsedCar used1 = new UsedCar(2500, 100000);
  UsedCar used2 = new UsedCar(2500, 100000);
  if (used1.equals(used2))
  {
	used1.display();
  }
} // end main
 
Output:
 
price = $16,000.66, color = silver
price = $5,000.00, mileage = 100,000  



Reference: 
Dean, J. Dean, R. (2021).  Introduction to programming with java: a problem solving approach (3rd edition). McGraw-Hill Education.
