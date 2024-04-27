package org.example.Class23_ArrayList;

import java.util.ArrayList;

public class E2_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();

        names.add("Mohammed");
        names.add("Sahadat");
        names.add("Hossain");
        names.add("Sujon");

        System.out.println(names);
        System.out.println(names.size());
        names.remove("Mohammed");
        System.out.println(names);
        System.out.println(names.size());
        names.remove(0);
        System.out.println(names);


    }//end of main
}//end of class
