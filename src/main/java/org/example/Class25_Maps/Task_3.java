package org.example.Class25_Maps;

import java.util.Map;
import java.util.TreeMap;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV
etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class Task_3 {
    public static void main(String[] args) {

        Map<Integer,String> bestBuyMap=new TreeMap<>();
        bestBuyMap.put(7664847,"Printer");
        bestBuyMap.put(7879885,"TV");
        bestBuyMap.put(7788988,"Laptop");
        bestBuyMap.put(3787988,"Camera");
        bestBuyMap.put(2787988,"Tablet");


        //Set<Map.Entry<Integer,String>> entrySet= bestBuyMap.entrySet();

        //var entrySet = bestBuyMap.entrySet();
        //same as line 23
        //System.out.println(entrySet);
        bestBuyMap.forEach((itemId, item) -> System.out.println("Item ID: " + itemId + ", Item: " + item));


    }//end of main
}//end of class
