package org.example.Class5;

import java.util.Scanner;

public class E5_Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= scanner.nextInt();
        System.out.println("Please enter your name");
        scanner.nextLine();
        String fullName= scanner.nextLine();
        System.out.println("Your name is " +fullName+ " you are "+age+" years old");
    }//end of main

}//end of class
