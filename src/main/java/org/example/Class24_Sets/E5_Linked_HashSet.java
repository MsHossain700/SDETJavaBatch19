package org.example.Class24_Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class E5_Linked_HashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(50);
        numbers.add(50);
        numbers.add(23);
        numbers.add(45);
        numbers.add(30);

        System.out.println(numbers);
        System.out.println("********************************");
        for (Integer i:numbers){
            System.out.println(i);
        }
        System.out.println("********************************");

        numbers.forEach(x-> System.out.println(x));

        System.out.println("********************************");



    }//end of main
}//end of class