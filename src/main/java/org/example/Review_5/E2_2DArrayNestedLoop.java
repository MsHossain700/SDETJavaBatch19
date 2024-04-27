package org.example.Review_5;

public class E2_2DArrayNestedLoop {
    public static void main(String[] args) {

        String [][] names={
                {"James","Ihab","Ana"},
                {"Zarina","Teona","Manu"},
                {"Will","Barkat","Olga"}
        };

        /*
        System.out.println(names[0][0]);
        //1st square bracket specifies the rows(horizontal)
        //2nd square bracket specifies the column(Vertical)
        System.out.println(names[0][1]);
        System.out.println(names[0][2]);
        System.out.println(names[1][1]);
        System.out.println(names[1][2]);

         */

        for(int i =0; i<3; i++){
            for (int j = 0; j < 3;j++){

                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

    }//end of main
}//end of class
