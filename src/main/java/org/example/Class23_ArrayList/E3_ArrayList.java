package org.example.Class23_ArrayList;

import java.util.ArrayList;

public class E3_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Mohammed");
        names.add("Sahadat");
        names.add("Hossain");
        names.add("Sujon");
        System.out.println(names.contains("Sahadat"));
        //searches the ArrayList for this data
        System.out.println(names.get(0));
        //searches the ArrayList for this index
        System.out.println(names.isEmpty());
        //returns boolean. if empty returns true otherwise false
        System.out.println(names.indexOf("Sahadat"));
        //will provide the index of the data in the ArrayList
        System.out.println(names.set(0,"Sujon"));
        //Replaces data from the index with new data
        System.out.println(names);






    }//end of main
}//end of class