package org.example.Class5;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Please enter a random number: ");
        double randomNumber = scanner.nextDouble();

        if (randomNumber >= 1 && randomNumber <=10){
            System.out.println("It is a small number");
        } else if (randomNumber >= 11 && randomNumber <=100) {
            System.out.println("It is a medium number");
        } else if (randomNumber >= 101 && randomNumber <=1000) {
            System.out.println("It is a large number");
        } else {
            System.out.println("Wrong number");
        }

    }//end of main

}//end of class
