package org.example.Class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        //new Scanner(System.in) creating the object
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the price of apples");
        double price=scan.nextInt();
        System.out.println("Price of apples " +price);

    }//end of main
}//end of class

