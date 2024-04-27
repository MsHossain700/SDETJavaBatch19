package org.example.Class24_Sets;

import java.util.LinkedList;

/*
Create a Cat class create 3 fields a constructor and printInfo
method inside it. Create three objects from this class store them
inside the Linkedlist and call printInfo method using these three
objects.
 */
public class Cat {

        private String name;
        private int age;
        private String breed;
        Cat(String name, int age, String breed) {
                this.name = name;
                this.age = age;
                this.breed = breed;
        }

       public void printInfo() {
           System.out.println(name + " " + age + " " + breed);
        }

       public static void main(String[] args) {
             LinkedList<String> catList =new LinkedList<>();

             Cat cat1 = new Cat("Whiskers", 3, "Siamese");
             Cat cat2 = new Cat("Mittens", 5, "Persian");
             Cat cat3 = new Cat("Felix", 2, "Maine Coon");

             //catList.add(cat1);
             //catList.add(cat2);
             //catList.add(cat3);
             catList.forEach(cat -> System.out.println(catList));


               }





}//end of class
