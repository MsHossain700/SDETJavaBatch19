package org.example.Class18_Super_Method_Overloading;
/*
Create a class named 'Programming' While creating an object of the
class, if nothing is passed to it, then the message
"I love programming languages" should be printed.
If some String is passed to it, then in place of
"programming languages" the value variable should be printed.
Example, if we pass "Java", then "I love Java" should be printed.
 */
public class Programming {
    private String value;

    // Constructor with default message
    Programming() {
        System.out.println("I love programming languages");
    }

    // Constructor with custom message
    Programming(String value) {
        this.value = value;
        System.out.println("I love " + this.value);
    }

    public static void main(String[] args) {

        // Using default constructor
        new Programming();

        // Using parameterized constructor
        new Programming("Java");
    }

}
