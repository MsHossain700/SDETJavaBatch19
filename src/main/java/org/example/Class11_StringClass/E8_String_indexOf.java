package org.example.Class11_StringClass;

public class E8_String_indexOf {
    public static void main(String[] args) {

        /*
        .indexOf returns the index of the letter in the string
        if the letter appears multiple times, java will provide the
        index of the first time it appears
         */
        String str="Matt is going to regret soon";
        System.out.println(str.indexOf('m'));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('t'));
        System.out.println(str.indexOf('g'));



    }//end of main
}//end of class
