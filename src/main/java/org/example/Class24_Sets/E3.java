package org.example.Class24_Sets;

import java.util.LinkedList;

public class E3 {
    public static void main(String[] args) {

        long startTime= System.currentTimeMillis();
        LinkedList<String> names = new LinkedList<>();
        for (int i=0; i<100000 ;i++){
            names.add(0,"Nikola");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);


    }//end of main
}//end of class
