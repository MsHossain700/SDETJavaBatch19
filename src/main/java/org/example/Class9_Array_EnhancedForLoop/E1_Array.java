package org.example.Class9_Array_EnhancedForLoop;

public class E1_Array {
    public static void main(String[] args) {

        int [] numbers={10,25,45,66,85,100};

        System.out.println(numbers.length);
        System.out.println(numbers[3]);

        for (int i=0; i< numbers.length; i++){
            System.out.println(i+ " " + numbers[i] + " ");
            // this prints the index and the number

        }


    }//end of main
}//end of class
