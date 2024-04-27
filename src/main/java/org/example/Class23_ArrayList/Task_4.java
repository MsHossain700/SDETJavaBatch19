package org.example.Class23_ArrayList;

import java.util.ArrayList;

/*
Create an arrayList of words. Remove every word that ends with "e”.
 */
public class Task_4 {
    public static void main(String[] args) {
        ArrayList<String> pokemons= new ArrayList<>();

        pokemons.add("Giratina");
        pokemons.add("Mewtwo");
        pokemons.add("Mew");
        pokemons.add("Arceus");
        pokemons.add("Rayquaza");
        pokemons.add("Torterra");
        pokemons.add("are");
        pokemons.add("table");

        /*
        for (int i = pokemons.size() - 1; i >= 0; i--) {
            String word = pokemons.get(i);
            if (word.endsWith("e")) {
                pokemons.remove(i);
            }
        }

        for (String word : pokemons) {
            System.out.println(word);
        }
         */

        pokemons.removeIf(x->x.endsWith("e"));
        System.out.println(pokemons);


    }//end of main
}//end of class
