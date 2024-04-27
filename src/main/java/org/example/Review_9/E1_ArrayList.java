package org.example.Review_9;

import java.util.ArrayList;

public class E1_ArrayList {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(45.0);
        numbers.add(50.0);
        numbers.add(60.0);
        numbers.add(20.0);

        System.out.println(numbers);
        System.out.println("**************************************");

        numbers.forEach(g-> System.out.println(g));
        System.out.println("**************************************");

        for (int i = 0; i< numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("**************************************");
        for (double d:numbers){
            System.out.println(d);
        }

        System.out.println("**************************************");
        //can also use ifs with forEach loop
        numbers.forEach(g-> {
            if (g > 30.0) {
                System.out.println(g);
            }
        });




    }//end of main
}//end class
