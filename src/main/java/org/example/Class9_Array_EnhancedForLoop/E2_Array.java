package org.example.Class9_Array_EnhancedForLoop;

public class E2_Array {
    public static void main(String[] args) {

        int [] numbers={10,25,45,66,85,100};
        for (int i=0; i< numbers.length; i=i+2){
            System.out.println(i+ " " + numbers[i] + " ");
            // this prints odd index and the numbers
        }

    }//end of main

}//end of class
