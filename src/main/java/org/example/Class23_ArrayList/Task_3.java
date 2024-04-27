package org.example.Class23_ArrayList;

import java.util.ArrayList;

/*
Create an ArrayList of drinks call it. If any drink has letter "a" or
"e" replace the whole word
 */
public class Task_3 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Mojito");
        drinks.add("old fashioned");
        drinks.add("Mint Julep");
        drinks.add("French 75");
        drinks.add("Tea");


        for(int i=0; i<drinks.size();i++){
            String drink=drinks.get(i);
            if(drink.contains("a")|| drink.contains("e")){
                drinks.set(i,"contains a or e");
            }
        }

        System.out.println(drinks);


    }//end of main
}//end of class
