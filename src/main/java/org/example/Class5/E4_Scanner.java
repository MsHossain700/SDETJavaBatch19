package org.example.Class5;

import java.util.Scanner;

public class E4_Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the gender m/f");
        char gender=scanner.next().charAt(0);
        /* .next().charAt(0) will take the first letter.
        or any character the index ".charAt(0)" dictates
         */
        System.out.println(gender);


    }//end of main

}//end of main
