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
        // I learned that local variables only exist inside the method they're
        // written in.

        // Calculation to display the person's birth year
        int birthYear1 = person1.calculateBirthYear(2025);
        int birthYear2 = person2.calculateBirthYear(2025);

        System.out.println("Person 1's Birth Year: " + birthYear1);
        System.out.println("Person 2's Birth Year: " + birthYear2);
        System.out.println();

        // Check if each person is an adult
        System.out.println("Person 1 is an adult: " + person1.isAdult());
        System.out.println("Person 2 is an adult: " + person2.isAdult());
    }
}
