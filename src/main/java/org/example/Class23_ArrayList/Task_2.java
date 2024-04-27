package org.example.Class23_ArrayList;

import java.util.ArrayList;
/*
Create an ArrayList of cars and retrieve all the values using 2
different ways.
 */
public class Task_2 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Lancia");
        cars.add("Alfa Romeo");

        for (String c:cars){
            System.out.println(c);
        }

        cars.forEach(x-> System.out.println(x));


    }//end of main
}//end of class
