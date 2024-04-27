package org.example.Class11_StringClass;

public class E14_Split {
    public static void main(String[] args) {

        String str = "Matt you still have time to run away. Listen to me only. Every one else is lying";
        String[] sentences =str.split("[.]");
        System.out.println(sentences.length);
        System.out.println(sentences[1]);
        System.out.println(sentences[1].trim());//trims the space in the beginning

    }//end of main
}//end of class
