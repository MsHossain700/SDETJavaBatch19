package org.example.Class11_StringClass;

public class Task_7 {
    public static void main(String[] args) {
        /*
        2)Create a String that should be combination of letters,
        numbers and special characters. Find out how many
        Alphabets(abd AZ) characters are there in the String.
         */

        String str="letters556977@##";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());


    }//end of main
}//end of class
