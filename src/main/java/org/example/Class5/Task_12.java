package org.example.Class5;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your country name: ");
        String country=scanner.nextLine().toLowerCase();

        switch (country){
            case "usa":
                System.out.println("We speak English");
                break;
            case "mexico":
                System.out.println("We speak Spanish");
                break;
            case "germany":
                System.out.println("We speak German");
                break;
            case "france":
                System.out.println("We speak French");
                break;
            case "italy":
                System.out.println("We speak Italian");
                break;
            case "portugal":
                System.out.println("We speak portuguese");
                break;
            default:
                System.out.println("Invalid input");
        }

    }//end of main

}//end of class
