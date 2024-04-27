package org.example.Review_6;

public class E6_String_replaceAll {
    public static void main(String[] args) {


        String str="This is an example of a string and I don't like Java";
        System.out.println(str.replaceAll("[^0-9]","*"));
        System.out.println(str.replaceAll("[^0-9]",""));

    }//end of main
}//end of class
