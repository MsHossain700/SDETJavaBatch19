package org.example.Class11_StringClass;

public class E6_String_equals {
    public static void main(String[] args) {

        //String str=new String("    Java is easy"); is same as
        String st= "Kitchen";
        /*
        .equals is case-sensitive
         */
        System.out.println(st.equals("Chicken"));
        System.out.println(st.equals("Kitchen"));

        //.equalsIgnoreCase ignores upper or lowe case letters
        System.out.println(st.equalsIgnoreCase("kitchen"));


    }//end of main
}//end of class