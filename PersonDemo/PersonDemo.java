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

        System.out.println("Person 2: ");
        person2.displayInfo();
    }
}
