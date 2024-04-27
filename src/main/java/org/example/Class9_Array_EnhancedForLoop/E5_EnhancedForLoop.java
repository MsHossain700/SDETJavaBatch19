package org.example.Class9_Array_EnhancedForLoop;

public class E5_EnhancedForLoop {
    public static void main(String[] args) {

        int [] numbers={10,25,45,66,85,100};

        int sum = 0;
        for (int n:numbers){
            sum = sum+n;
        }
        double average = sum / numbers.length;
        System.out.println(average);

    }//end of main
}//end of class
