package org.example.Class14_Variables;

public class E1_LocalVariables {

    String name;//not a local variable

    int age;//not a local variable

    int add (int a, int b){//int a and b are local variables
        return a+b;
    }

    void printNumber ( int number){

        if ( number > 10){
            int sum=30;//sum is local variable
        }
    }

    public static void main(String[] args) {
        int sum = 30;
        int base= sum+45;
        System.out.println(base);

    }
}//end fo class
