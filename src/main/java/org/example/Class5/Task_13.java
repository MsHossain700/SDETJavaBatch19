package org.example.Class5;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a grade: ");
        char grade=scanner.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not acceptable");
                break;
        }

    }//end of main

}//end of class
