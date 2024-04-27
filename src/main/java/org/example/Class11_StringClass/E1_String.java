package org.example.Class11_StringClass;

public class E1_String {
    public static void main(String[] args) {

        /*we are creating the object of the String class and storing that
        object in the ste variable
        */
        String str = new String("Today is Java");
        int len = str.length();
        System.out.println(len);
        System.out.println(str.length());

        if(len > 4){
            System.out.println("String is too long");
        }



    }//end of main
}//end of class
