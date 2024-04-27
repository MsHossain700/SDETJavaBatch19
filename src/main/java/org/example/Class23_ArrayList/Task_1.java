package org.example.Class23_ArrayList;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {

        ArrayList<String> pokemons= new ArrayList<>();

        pokemons.add("Giratina");
        pokemons.add("Mewtwo");
        pokemons.add("Mew");
        pokemons.add("Arceus");
        pokemons.add("Rayquaza");
        pokemons.add("Torterra");


        System.out.println(pokemons.isEmpty());
        System.out.println(pokemons.contains("Palkia"));
        System.out.println(pokemons.size());

        pokemons.forEach(x-> System.out.println(x));


    }//end of main
}//end of class
