package org.example.Class25_Maps;

import java.util.TreeMap;

public class E6_TreeMap {
    public static void main(String[] args) {

        TreeMap<String, Double> fruit = new TreeMap<>();
        fruit.put("Kiwi", 25.5);
        fruit.put("Apple", 5.5);
        fruit.put("Orange", 5.5);
        fruit.put("Banana", 30.5);

        System.out.println(fruit.values());//prints only the value
        //Collection<Double> values=fruit.values(); same as line 17
        var values=fruit.values();
        values.removeIf(x->x>10);
        System.out.println(fruit);



    }//end of main
}//end of class
