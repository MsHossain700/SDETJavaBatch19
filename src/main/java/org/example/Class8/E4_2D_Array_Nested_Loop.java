package org.example.Class8;

public class E4_2D_Array_Nested_Loop {
    public static void main(String[] args) {


        for (int j = 0; j<3 ; j++){//will create 3 rows
            for (int i = 0; i < 5; i++){//will create 5 columns
                System.out.print("*");
            }
            System.out.println();//makes the * print in next line
        }

        /*
        the above code is the same as the bottom set of codes.
         */

        for (int i =0; i<5; i++){//creates 1st row
            System.out.print("*");
        }
        System.out.println();//makes it print in next line

        for (int i =0; i<5; i++){//creates 2nd row
            System.out.print("*");
        }
        System.out.println();//makes it print in next line

        for (int i =0; i<5; i++){//creates 3rd row
            System.out.print("*");
        }
        System.out.println();//makes it print in next line


    }//end of main

}//end of class
