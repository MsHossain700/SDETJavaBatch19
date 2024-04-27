package org.example.Review_3;

import java.util.Scanner;

public class E2_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        char grade= scan.next().toUpperCase().charAt(0);

        switch (grade){

            case 'A':
                System.out.println("Very good grade");
                break;
            case 'B':
                System.out.println("Good grade");
                break;
            case 'C':
                System.out.println("Avg grade");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            case 'F':
                System.out.println("Very bad grade");
                break;
            default:
                System.out.println("Invalid input");
        }






    }//end of main

}//end of class

