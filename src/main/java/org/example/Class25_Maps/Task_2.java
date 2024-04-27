package org.example.Class25_Maps;

import java.util.TreeMap;

/*
Create a map of countries(5) with its capital that will store
countries in alphabetical order. Country names will be keys and
capitals will be values
Print all keys and values from a country map using for each loop or
Lambda.
Print all values from a country map using for each loop or Lambda.
 */
public class Task_2 {
    public static void main(String[] args) {

        TreeMap<String, String> countries = new TreeMap<>();

                       //keys     //values
        countries.put("Austria","Vienna");
        countries.put("Japan","Tokyo");
        countries.put("Liechtenstein","Vaduz");
        countries.put("Honduras","Tegucigalpa");
        countries.put("Djibouti","Djibouti City");

        // Print all keys and values using lambda expression
        countries.forEach((country, capital) -> System.out.println("Country: " + country + ", Capital: " + capital));

        // Print all values using lambda expression
        countries.values().forEach(System.out::println);







    }//end of main
}//end of class
