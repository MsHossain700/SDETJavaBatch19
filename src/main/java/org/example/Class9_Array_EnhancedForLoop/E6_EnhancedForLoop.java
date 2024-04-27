package org.example.Class9_Array_EnhancedForLoop;

public class E6_EnhancedForLoop {
    public static void main(String[] args) {

        //find the average of numbers greater than 25
        int [] numbers={10,25,45,66,85,100};

        double sum = 0;
        int counter=0;
        //counter is used to keep track of numbers that are greater than 25

        for (int n:numbers) {
            if (n > 25) {
                sum = sum + n;//sum+=n as a shorthand
                counter++;
                //used to increment the value of the count variable by 1
            }
        }
        System.out.println(sum/counter);

    }//end of main
}//end of class
