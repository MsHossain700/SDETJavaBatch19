package org.example.Class5;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the amount of loan you need?");
        int loanAmount= scanner.nextInt();
        if(loanAmount<=200000){
            System.out.println("You are eligible to borrow money");
        }else {
            System.out.println("you are not allowed to borrow money");
        }


    }//end of main

}//end of class
