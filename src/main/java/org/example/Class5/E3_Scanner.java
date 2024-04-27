package org.example.Class5;

import java.util.Scanner;

public class E3_Scanner {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your firstName");
        String firstName=scanner.next();/* scanner.next will only
        catch the first word */
        System.out.println(firstName);
        Scanner scanner2=new Scanner(System.in);
        String name=scanner2.nextLine();/*.nextLine will catch all
        the words */
        System.out.println(name);


    }//end of main

}//end of class
