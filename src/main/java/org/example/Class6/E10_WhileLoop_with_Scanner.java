package org.example.Class6;

import java.util.Scanner;

public class E10_WhileLoop_with_Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the starting point: ");
        int start=scanner.nextInt();

        while (start<10){
            //starting number have to be less than 10
            System.out.println(start);
            start++;
        }

    }//end of main

}//end of class
