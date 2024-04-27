package org.example.Class25_Maps;

import java.util.HashMap;

public class E2_Hashmap {
    public static void main(String[] args) {

        HashMap<String,Integer> makeUpMap=new HashMap<>();
        makeUpMap.put("Blush",20);
        makeUpMap.put("Lipstick",50);
        makeUpMap.put("EyeLiner",40);
        makeUpMap.put("Foundation",100);

        makeUpMap.remove("Lipstick");
        System.out.println(makeUpMap);
        makeUpMap.replace("EyeLiner",70);
        System.out.println(makeUpMap);



    }//end of main
}//end of class

