package org.example.Class25_Maps;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Create a collection that will store single unique objects of a
String type in which order is preserved.
    a. Write a logic to concatenate all string from the collection
 */
public class Task_4 {
    public static void main(String[] args) {
        Set<String> stringCollection = new LinkedHashSet<>();
        stringCollection.add("Apple");
        stringCollection.add("Orange");
        stringCollection.add("Banana");
        stringCollection.add("Grape");
        stringCollection.add("Kiwi");

        for (String str : stringCollection) {
            System.out.print(str+" ");
        }


    }//end of main
}//end of class
