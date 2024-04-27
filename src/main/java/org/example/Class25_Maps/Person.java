package org.example.Class25_Maps;
/*
Create a Person class with following private fields: name, lastName,
 age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object
details.
Example of key is 1 , 2 ,3 etc
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person (String firstName, String lastName,
                        int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}//end of class

