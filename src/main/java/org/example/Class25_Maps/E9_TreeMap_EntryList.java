package org.example.Class25_Maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E9_TreeMap_EntryList {
    public static void main(String[] args) {

        Map<Integer,String> students=new TreeMap<>();
        students.put(1,"Nikola");
        students.put(6,"Will");
        students.put(7,"Ali");
        students.put(3,"Nikola");
        students.put(2,"Nikola");

        System.out.println(students);
        Set<Map.Entry<Integer,String>> entrySet= students.entrySet();
        entrySet.removeIf(x->x.getKey()>3&&x.getValue().contains("l"));
        System.out.println(students);



    }//end of main
}//end of class
