package org.example.Class5;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your age?");
        int age= scanner.nextInt();
        if(age>18){
            System.out.println("You will be issued a drivers license");
        }else {
            System.out.println("You can get a learners permit");
        }

    }//end of main
}//end of class
