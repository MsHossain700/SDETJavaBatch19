package org.example.Class11_StringClass;

public class E7_String_charAt {
    public static void main(String[] args) {

        String str="Matt is going to regret soon";
        System.out.println(str.charAt(2));
        /*
        System.out.println(str.charAt(200));
        will return error indexOutOfBoundsException
        */
        for (int i = 0; i <str.length(); i++ ){
            System.out.println(str.charAt(i));
        }



    }//end of main
}//end of class
