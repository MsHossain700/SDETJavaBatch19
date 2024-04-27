package org.example.Class12_StringBuilder;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        /*
        How would you check if String is palindrome or not? aba=>true
        Abbc => false
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String originalStr=scan.next();

        //String originalStr = "racecar";
        StringBuilder str = new StringBuilder(originalStr);
        str.reverse();
        String reversedStr=str.toString();

        if (originalStr.equals(reversedStr)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }




    }//end of main
}//end of class

