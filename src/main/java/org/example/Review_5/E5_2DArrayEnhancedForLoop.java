package org.example.Review_5;

public class E5_2DArrayEnhancedForLoop {
    public static void main(String[] args) {
        int [][] numbers = {
                {10,20,30,40},
                {50,70,15,88},
                {40,52,89,77}
        };

        //write a code to add all the numbers which are above 50

        int sum=0;

        for ( int[] row : numbers){
            for (int column : row){
                if(column >50){
                    sum +=column;//this is same as sum = sum + column
                }
            }

        }
        System.out.println(sum);

    }//end of main
}//end class
