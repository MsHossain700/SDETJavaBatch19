package org.example.Class9_Array_EnhancedForLoop;

public class E5_Array {
    public static void main(String[] args) {

        int [] numbers={10,25,45,66,85,100};


        // default sum value.
        int sum = 0;

        // sum of all values in array using for loop
        for (int i = 0; i < numbers.length; i++) {
            sum = sum+numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println(average);

    }//end of main

}//end of class
