package org.example.Class5;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person's height in inches: ");
        int heightInInches = scanner.nextInt();

        if (heightInInches < 60) {
            System.out.println("Person is short.");
        } else if (heightInInches >= 60 && heightInInches <= 72) {
            System.out.println("Person is medium.");
        } else {
            System.out.println("Person is tall.");
        }

    }//end of main

}//end of class
