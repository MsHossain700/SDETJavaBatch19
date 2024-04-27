package org.example.Class28_Exceptions;

public class E1_Exception {
    public static void main(String[] args) {

        System.out.println("1");
        System.out.println("2");
        try{
            System.out.println(10/0);}
        catch(ArithmeticException e){
                System.out.println("Backup code has been executed");
            }
        catch (Exception e){
            System.out.println("General backup code executed");
        }
        System.out.println("3");
        System.out.println("4");


    }//end of main
}//end of class
