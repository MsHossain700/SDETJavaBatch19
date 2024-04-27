package org.example.Review_6;

public class E8_String_Split {
    public static void main(String[] args) {

        String str="This is an example of a string. I don't like Java";
        String [] arr= str.split("[.]");
        System.out.println(arr[1].trim());
    }//end of main
}//end of class
