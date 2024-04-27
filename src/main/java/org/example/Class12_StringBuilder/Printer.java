package org.example.Class12_StringBuilder;

public class Printer {
    void printHello(){
        System.out.println("Hello World");
    }

    void printWord(String word){
        System.out.println("Hello " + word );
    }

    void printManyWords(int count, String word){
        for (int i = 0; i<count; i++){
            System.out.println(word);
        }
    }
}//end of class
