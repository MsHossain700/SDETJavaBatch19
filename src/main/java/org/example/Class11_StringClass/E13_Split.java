package org.example.Class11_StringClass;

public class E13_Split {
    public static void main(String[] args) {

        String str = "Matt you still have time to run away";
        String [] words = str.split(" ");
        System.out.println(words.length);
        System.out.println(words[0]);

        for (int i = 0; i< words.length; i++){
            System.out.println(words[i]);
        }

    }//end of main
}//end of class
