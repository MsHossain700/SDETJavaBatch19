package org.example.Class28_Exceptions;

public class E4_Finally {
    public static void main(String[] args) {

        try {
            //the code which might cause an Exception goes inside Try
            System.out.println("1");
        }catch (Exception e){
            //the backup code goes indie Catch
            System.out.println("2");
        }finally {
            //The code that you want to execute always
            System.out.println("3");
        }




    }//end of main
}//end of class