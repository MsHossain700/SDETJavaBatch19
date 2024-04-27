package org.example.Class12_StringBuilder;

public class E3_StringBuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Sunday7343Monday");
        str.deleteCharAt(6);//deletes a specific character with index
        //str.delete(6,10);//deletes characters from index 6 to 10
        System.out.println(str);


    }//end of main
}//end of class
