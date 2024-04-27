package org.example.Class11_StringClass;

public class E11_replaceAll {
    public static void main(String[] args) {

        String str = "5644sadfdhktysadqwe";
        System.out.println(str.replaceAll("[4-9]","*"));
        System.out.println(str.replaceAll("[a-f]","*"));
        System.out.println(str.replaceAll("[4-9]",""));
        System.out.println(str.replaceAll("[4-9]"," "));
    }//end of main
}//end of class
