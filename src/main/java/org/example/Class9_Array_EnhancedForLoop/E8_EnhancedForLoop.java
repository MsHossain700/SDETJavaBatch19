package org.example.Class9_Array_EnhancedForLoop;

public class E8_EnhancedForLoop {
    public static void main(String[] args) {

        //find the number of odd numbers
        int [] numbers={10,25,45,66,85,100,26,89,56,33};
        int oddCount=0;

        // Iterate through each element in the array
        for (int number:numbers){
            if (number % 2 != 0){//used to find odd numbers. logical not
                oddCount++;//Increment the count if the number is odd
            }
        }
        System.out.println(oddCount);

        // Iterate through each element in the array




    }//end of main
}//end of class
