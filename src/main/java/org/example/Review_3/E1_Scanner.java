package org.example.Review_3;

import java.util.Scanner;

public class E1_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
            System.out.print("Please enter your age: ");
            int age=scan.nextInt();
            if(age>=18){
                System.out.println("You are allowed to vote");
            }else {
                System.out.println("You are not allowed to vote");
            }



    }//end of main

}//end of class
