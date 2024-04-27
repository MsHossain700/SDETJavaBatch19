package org.example.Review_9;

import java.util.ArrayList;
import java.util.Collections;

public class E3 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;
        for (int a: numbers){
            sum+=a;
        }

        System.out.println(sum);
    }//end of main
}//end of class
