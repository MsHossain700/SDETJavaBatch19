package org.example.Class18_Super_Method_Overloading;
/*
Create a method to find the minimum of two numbers. Method will be
passed two parameters and will return the minimum number.
Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5

Use separate class to test your code
 */
public class Task_1 {

    public void minNum(int a,int b){
        if( a<b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public void minNum(double a, double b){
        if( a<b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

    }

}



