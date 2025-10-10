/********************************
* Person.java
* Author: Joe Goode
* 
* Create a simple Person class
********************************/

package PersonDemo;

public class Person {
    // Instance variables for the person's info
    private String name;
    private int age;
    private String email;

    // Create a constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // A method to display the person's info
    public void displayInfo() {
        // Local variable for this method only (for testing purposes)
        // String address = "123 Main St";

        // Display the info on the console
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

    // Method to calculate the person's birth year
    public int calculateBirthYear(int currentYear) {
        // Returns the result of the current year minus the age of the person
        return currentYear - age;
    }

    // Method to check if the person is an adult
    public boolean isAdult() {
        // Returns true if 18 or older
        return age >= 18;
    }
}
