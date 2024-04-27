package org.example.Class25_Maps;

import java.util.HashMap;

public class E1_HashMap {
    public static void main(String[] args) {

        HashMap<String,Integer> makeUpMap=new HashMap<>();
        makeUpMap.put("Blush",20);
        makeUpMap.put("Lipstick",50);
        makeUpMap.put("EyeLiner",40);
        makeUpMap.put("Foundation",100);

        System.out.println(makeUpMap.get("Lipstick"));
        System.out.println(makeUpMap.size());
        System.out.println(makeUpMap.containsKey("EyeLiner"));
        System.out.println(makeUpMap.containsValue(100));
        System.out.println(makeUpMap.isEmpty());



    }//end of main
}//end of class
