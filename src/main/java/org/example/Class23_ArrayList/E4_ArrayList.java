package org.example.Class23_ArrayList;

import java.util.ArrayList;

public class E4_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Mohammed");
        names.add("Sahadat");
        names.add("Hossain");
        names.add("Sujon");

        for (int i = 0; i< names.size();i++){
            System.out.println(names.get(i));
        }

        System.out.println("******************");

        for (String s:names){

        }







    }//end of main
}//end of class