package org.example.Class11_StringClass;

public class Task_6 {
    public static void main(String[] args) {
        /*
        1)Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        2)Create a String that should be combination of letters, numbers and special characters. Find out how many Alphabets(abd AZ) characters are there in the String.
        3)You have a String a=” Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
         */

        String str = " Java is very eASY";
        String newString= str.replaceAll(" ","");
        System.out.println(newString);


    }//end fo main
}//end of class
