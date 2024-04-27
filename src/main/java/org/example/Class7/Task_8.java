package org.example.Class7;

public class Task_8 {
    public static void main(String[] args) {

        /*
        create an array char values and print them in reverse order
         */
        char [] charValues=new char[5];
        charValues[0]='A';
        charValues[1]='B';
        charValues[2]='C';
        charValues[3]='D';
        charValues[4]='E';

        for (int i = charValues.length - 1; i >= 0; i--) {
            System.out.println(charValues[i]);
        }



    }//end of main

}//end of class
