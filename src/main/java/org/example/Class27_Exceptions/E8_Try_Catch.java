package org.example.Class27_Exceptions;

public class E8_Try_Catch {
    public static void main(String[] args) {

        try{
            System.out.println("Hello World");
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("Backup code executed we are good");

        }


    }//end of main
}//end of class
