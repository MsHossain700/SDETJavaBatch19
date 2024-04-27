package org.example.Class12_StringBuilder;

import java.util.Scanner;

public class Task_5_Tester {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String originalStr=scan.next();
        Task_5 T5= new Task_5();

        T5.isPalindrome (originalStr);
    }//end of main
}//end of class
