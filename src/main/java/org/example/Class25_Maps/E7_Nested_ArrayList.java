package org.example.Class25_Maps;




import java.util.ArrayList;

public class E7_Nested_ArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> list= new ArrayList<>();

        ArrayList<String> names= new ArrayList<>();
        names.add("Sahadat");

        ArrayList<String> names2= new ArrayList<>();
        names2.add("Mohammed");
        names2.add("Hossain");
        list.add(names);
        list.add(names2);
        System.out.println(list);



    }//end of main
}//end of class
