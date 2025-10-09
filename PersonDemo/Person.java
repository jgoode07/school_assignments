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
        // Local variable for this method only
        String address = "123 Main St"; // Just for testing purposes

        // Display the info on the console
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}
