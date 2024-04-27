package org.example.Class23_ArrayList;

import java.util.ArrayList;

/*
Create an arrayList of even numbers from 1 to 500 using a loop.
Then write another loop to Remove any number that is divisible by
5 from that arrayList.
 */
public class Task_5 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers= new ArrayList<>();

        for (int i=0; i<=500; i+=2){
            evenNumbers.add(i);
        }

        System.out.println(evenNumbers);
        evenNumbers.removeIf(number ->number%5==0);
        System.out.println(evenNumbers);




    }//end fo main
}//end of class
