package org.example.Class6;

import java.util.Scanner;

public class E11_Loops {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the starting number for the loop");
        int start=scanner.nextInt();
        System.out.println("Please Enter the ending number");
        int end=scanner.nextInt();
        System.out.println("Please Enter the step size");
        int stepSize=scanner.nextInt();
        while (start<=end){
            System.out.print(start+" ");
            start=start+stepSize;
        }


    }//end of main

}//end of class
