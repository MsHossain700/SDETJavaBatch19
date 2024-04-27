package org.example.Review_4;

import java.util.Scanner;

public class E7_DoWhileLoop {
    public static void main(String[] args) {
        //do while loop is best used with scanner or something similar
        //in this example the code is written twice

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number=scanner.nextInt();
        while (number<10){
            System.out.print("Please enter the number: ");
            number=scanner.nextInt();
        }


    }//end of main
}//end of class
