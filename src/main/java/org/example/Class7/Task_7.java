package org.example.Class7;

public class Task_7 {
    public static void main(String[] args) {

        /*
        from and array of integer elements find the largest number
         */
        int[] numbers = {15, 8, 22, 45, 11, 7, 30};

        //using enhanced for loop to find the max number
        int maxNumber = numbers[0];

        //enhanced for loop
        for (int n:numbers) {
            if (maxNumber<n) {
                maxNumber = n;

            }//end of if conditional

        }//end of for loop

        System.out.println("The largest number is: " + maxNumber);

    }//end of main

}//end of class
