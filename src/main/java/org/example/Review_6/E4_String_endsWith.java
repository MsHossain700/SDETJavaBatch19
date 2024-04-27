package org.example.Review_6;

public class E4_String_endsWith {
    public static void main(String[] args) {

        String str= "Java is not easy";
        boolean r=str.contains("easy");
        System.out.println(r);
        System.out.println(str.endsWith("y"));
        System.out.println(str.endsWith("sy"));
        System.out.println(str.endsWith("easy"));
        System.out.println(str.endsWith("Java"));

    }//end of main
}//end of class
