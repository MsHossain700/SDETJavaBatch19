package org.example.Class25_Maps;

import java.util.Set;
import java.util.TreeMap;

public class E3_TreeMap {
    public static void main(String[] args) {

        TreeMap<String,Double>fruit=new TreeMap<>();
        fruit.put("Kiwi",25.5);
        fruit.put("Apple",10.5);
        fruit.put("Orange",5.5);
        fruit.put("Banana",30.5);

        Set<String>keys = fruit.keySet();

        for (String k:keys){
            System.out.println(k);
        }
        System.out.println("*************************");

        keys.forEach(x-> System.out.println(x));

        System.out.println("*************************");
        System.out.println(keys);




    }//end of main
}//end of class
