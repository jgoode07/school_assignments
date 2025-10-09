/******************************
* PersonDemo.java
* Author: Joe Goode
* 
* Testing the Person class
*******************************/

package PersonDemo;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Joe Goode", 39, "jgoode@sample.com");
        Person person2 = new Person("Sampson Superpup", 11, "sampsonitis@sample.com");

        // Display the people's info
        System.out.println("Person 1: ");
        person1.displayInfo();
        System.out.println(); // Add some space between people

        System.out.println("Person 2: ");
        person2.displayInfo();
        System.out.println();

        // Trying to access the local variable 'address' here...doesn't work
        // System.out.println(person1.address); // This line causes an error
        // I learned that local variables only exist inside the method they're written
        // in.
    }
}
