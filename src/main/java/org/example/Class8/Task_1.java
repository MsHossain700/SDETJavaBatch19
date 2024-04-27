package org.example.Class8;

public class Task_1 {
    public static void main(String[] args) {

        /*
        using nested loop print 7 rows of * with each row having 4 *
         */
        for (int j = 0; j<7 ; j++){//will create 7 rows
            for (int i = 0; i < 4; i++){//will create  columns
                System.out.print("*");
            }
            System.out.println();//makes the * print in next line
        }

    }//end of main
}//end of class
