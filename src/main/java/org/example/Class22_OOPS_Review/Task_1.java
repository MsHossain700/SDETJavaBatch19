package org.example.Class22_OOPS_Review;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder(a);
        String reversed = sb.reverse().toString().toLowerCase();

        if(reversed.equals(a.toLowerCase())){
            System.out.println("Is Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }

    }//end of main
}//end of class
