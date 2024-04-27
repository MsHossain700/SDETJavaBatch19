package org.example.Class11_StringClass;

public class Task_8 {
    public static void main(String[] args) {

        /*
        3)You have a String a=”Is it saturday? Is it raining?
        Do we have a Java Class today?” How would you find out how many
        sentences are in that String?
         */

        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(str.split("[?]").length);
    }//end of main
}//end of class
