package org.example.Class5;

public class E10_LogicalAnd {
    public static void main(String[] args) {

        /*
        Returns true if both boolean expressions are true;
        otherwise, it returns false.
         */

        double math= 95;
        double science= 92;
        double history= 93;

        if(math>90 && science >90 && history >90){
            System.out.println("Great work, you got an A+");
        }else{
            System.out.println("You need to work harder");
        }

    }//end of main

}//end of class
