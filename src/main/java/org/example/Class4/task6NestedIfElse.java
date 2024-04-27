package org.example.Class4;

public class task6NestedIfElse {
    public static void main(String[] args) {
        int age=29;
        int weight=145;

        if ((age>18)){
            System.out.println("He/she can donate blood");
            if (weight>=110){
                System.out.println("he/she is eligible");
            }else{
                System.out.println("he/she is not eligible");
            }
        }else {
            System.out.println("He/she cannot donate blood");
        }

    }//end of main
}//end of class
