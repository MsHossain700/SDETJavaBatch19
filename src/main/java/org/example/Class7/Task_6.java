package org.example.Class7;

public class Task_6 {
    public static void main(String[] args) {

        /*
        create and array of numbers and print the sum
         */
        double[] numbers={10.5,20.5,25,30};

        //using enhanced foe loop to add the array
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);

    }//end of main

}//end of class
