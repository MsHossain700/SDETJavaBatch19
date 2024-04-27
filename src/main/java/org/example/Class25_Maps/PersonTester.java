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
import java.util.Map;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {

        Map<Integer,Person> personMap=new TreeMap<>();

        personMap.put(1, new Person("Sahadat", "Hossain", 29, 150000));
        personMap.put(2, new Person("John", "Smith", 25, 600000));
        personMap.put(3, new Person("Bob", "Saget", 65, 700000));

        personMap.forEach((key, person) -> {
            System.out.println("Key: " + key + ", "+ person);

        });


    }//end of main
}//end of class
