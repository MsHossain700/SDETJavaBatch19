package org.example.Class12_StringBuilder;

public class E6_StringBuilder {
    public static void main(String[] args) {

        StringBuilder s= new StringBuilder();
        for (int i = 0; i<10000; i++){
            s.append(i);
        }

    }//end of main
}//end of class
