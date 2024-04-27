package org.example.Review_5;

public class E4_2DArrayNestedLoop {
    public static void main(String[] args) {
        int [][] numbers = {
                {10,20,30,40},
                {50,70,15,88},
                {40,52,89,77}
        };

        //write a code to add all the numbers which are above 50

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j][i] > 50);{
                    sum += numbers[i][j];

                }
            }
        }
        System.out.println(sum);

    }//end of main
}//end class
