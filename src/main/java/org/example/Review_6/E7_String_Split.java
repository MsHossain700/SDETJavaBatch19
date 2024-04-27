package org.example.Review_6;

public class E7_String_Split {
    public static void main(String[] args) {

        String str="This is an example of a string and I don't like Java";
        String [] arr= str.split("[a]");
        System.out.println(arr.length);
        System.out.println(arr[0]);

    }//end of main
}//end of class
