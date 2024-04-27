package org.example.Class5;

import java.util.Scanner;

public class E2_Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a byte number");
        byte smallBox= scanner.nextByte();
        System.out.println("Please enter a double number");
        double biggerBox= scanner.nextDouble();
        System.out.println("Please enter a boolean Value");
        boolean booleanV = scanner.nextBoolean();

        System.out.println(smallBox);
        System.out.println(biggerBox);
        System.out.println(booleanV);


    }//end of main

}//end of class
