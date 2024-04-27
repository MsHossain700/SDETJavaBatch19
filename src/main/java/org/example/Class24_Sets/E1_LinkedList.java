package org.example.Class24_Sets;

import java.util.LinkedList;

public class E1_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers =new LinkedList<>();
        numbers.add(50);
        numbers.add(200);
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);

        numbers.removeIf(d->d>30);
        System.out.println(numbers);


    }//end of main
}//end of class
