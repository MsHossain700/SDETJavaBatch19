package org.example.Class25_Maps;

import java.util.HashMap;
/*
Create a map of a building. Store floor number and its associated
company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries
with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class Task_1 {
    public static void main(String[] args) {

        HashMap<Integer,String> building1=new HashMap<>();
        building1.put(-1,"Apple");
        building1.put(2,"Amazon");
        building1.put(3,"Samsung");
        building1.put(4,"Microsoft");
        building1.put(5,"Google");
        building1.put(6,"Nvidia");
        building1.put(7,"Apple");

        System.out.println(building1.size());
        building1.replace(4,"Nokia");
        building1.remove(7);
        System.out.println(building1);



    }//end of main
}//end of class
