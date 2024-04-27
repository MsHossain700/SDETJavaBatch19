package org.example.Class25_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E8_Nested_dataStructure {
    public static void main(String[] args) {

        ArrayList<LinkedHashMap<String,Integer>> listMap= new ArrayList<>();

        LinkedHashMap<String, Integer> fruit= new LinkedHashMap<>();
        fruit.put("Kiwi", 25);
        fruit.put("Apple", 5);
        fruit.put("Orange", 5);
        fruit.put("Banana", 30);


        LinkedHashMap<String, Integer> makeUpMap= new LinkedHashMap<>();
        makeUpMap.put("Blush",20);
        makeUpMap.put("Lipstick",50);
        makeUpMap.put("EyeLiner",40);
        makeUpMap.put("Foundation",100);

        listMap.add(fruit);
        listMap.add(makeUpMap);

        System.out.println(listMap);
        System.out.println(listMap.get(0).get("Banana"));
      //will get the first map from the list and then get "Banana"




    }//end of main
}//end of class
