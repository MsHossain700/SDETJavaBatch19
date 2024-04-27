package org.example.Class3;

public class E1typeCasting {
    public static void main(String[] args) {
        byte num=10;
        int number=num;// <-- this is type casting
        //moving from smaller (byte) to larger (int) this is widening
        System.out.println(number);

        int num2=1000;
        //byte number2=num2;
        //if moving from larger (int) to smaller (byte) is called narrowing
        //could throw error

        double num3=10.5;
        int number3=(int)num3;// narrowing/manual/explicit
        System.out.println(num3);

        int num4=10;
        float number4=num4; //widening/automatic/implicit
        System.out.println(number4);


    }//en dof main
}//end of class
