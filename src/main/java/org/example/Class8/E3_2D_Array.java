package org.example.Class8;

public class E3_2D_Array {
    public static void main(String[] args) {

        /*
        10 20 40 50
        22 40 90 65
        15 50 33 30
         */

            int [][] matrix={
                    {10,20,40,50},
                    {22,40,90,65},
                    {15,50,33,30}
            };

        System.out.println(matrix[1][2]);
        System.out.println(matrix[2][3]);
        /*to call you do the rows first then you do columns.
        (horizontal then vertical. starting with 0)*/


    }//end of main

}//end of class
