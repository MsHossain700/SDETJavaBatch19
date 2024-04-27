package org.example.Review_5;

public class E3_2DArrayNestedLoop {
    public static void main(String[] args) {

        int [][] numbers = {
                {10,20,30,40},
                {50,70,15,88},
                {40,52,89,77}
        };
        //print the array using nested loop

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }

    }//end of main
}//end of class
