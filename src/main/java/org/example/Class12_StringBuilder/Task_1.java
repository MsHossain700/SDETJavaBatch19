package org.example.Class12_StringBuilder;

public class Task_1 {
    public static void main(String[] args) {

        /*
        how would you reverse a string word by word? for example:
        "This is sentence I want to reverse" to
        "sihT si ecnetnes i tnaw ot esrever"
         */

        String str = "This is sentence I want to reverse";
        String [] sentences = str.split("[ ]");
        for (String newStr:sentences){
            StringBuilder st= new StringBuilder(newStr);
            st.reverse();
            System.out.print(st + " ");
        }


    }//end of main
}//end of class
