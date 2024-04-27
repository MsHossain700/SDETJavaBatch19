package org.example.Class9_Array_EnhancedForLoop;

public class E7_EnhancedForLoop {
    public static void main(String[] args) {

        //find the number of even numbers
        int [] numbers={10,25,45,66,85,100,26,89,56,33};

        int evenCount=0;

        // Iterate through each element in the array
        for (int number : numbers) {
            // Check if the number is even
            if (number % 2 == 0) {
                evenCount++; // Increment the count if the number is even
            }
        }
        System.out.println(evenCount);

    }//end of main
}//end of class
