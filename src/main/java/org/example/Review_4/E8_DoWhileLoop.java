package org.example.Review_4;

import java.util.Scanner;

public class E8_DoWhileLoop {
    public static void main(String[] args) {
        //do while loop is best used with scanner or something similar

        Scanner scanner=new Scanner(System.in);
        int number=0;
        do{
            System.out.print("Please enter the number: ");
            number=scanner.nextInt();
        }while (number<10);


    }//end of main
}//end of class
