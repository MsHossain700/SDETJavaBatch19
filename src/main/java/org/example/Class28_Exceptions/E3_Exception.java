package org.example.Class28_Exceptions;

public class E3_Exception {
    public static void main(String[] args) {

        System.out.print(1);
        try {
            System.out.print(2);
            System.out.print(3);
            //int [] arr= new int[-5];
            System.out.println("Name".charAt(1000));
        }catch (ArithmeticException ae){
            System.out.print(4);
        }catch (NegativeArraySizeException ae){
            System.out.print(5);
        }catch (Exception e){
            System.out.print(6);
        }
        System.out.print(7);

    }//end of main
}//end of class