package org.example.Class22_OOPS_Review;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("provide a String: ");
        String S = in.next();
        System.out.print("Starting point: ");
        int start = in.nextInt(3);
        System.out.print("Ending point: ");
        int end = in.nextInt(7);

        System.out.println(S.substring(start,end));






    }//end of main
}//end of class
