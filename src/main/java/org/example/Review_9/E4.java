package org.example.Review_9;



import java.util.*;

public class E4 {
    public static void main(String[] args) {

       List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(Collections.frequency(numbers,10));




    }//end of main
}//end of class
