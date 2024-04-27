package org.example.Class12_StringBuilder;

import java.util.Scanner;

public class Task_4_Tester {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1= scan.nextInt();
        Task_4 T4= new Task_4();

        T4.evenOrOdd(num1);
    }//end of main
}//end of class
