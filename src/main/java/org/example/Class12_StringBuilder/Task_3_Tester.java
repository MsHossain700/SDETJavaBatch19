package org.example.Class12_StringBuilder;

import java.util.Scanner;

public class Task_3_Tester {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1= scan.nextInt();
        System.out.print("Please enter another number: ");
        int num2= scan.nextInt();
        Task_3 T3= new Task_3();

        T3.maxNum(num1,num2);

    }//end of main
}//end of class
