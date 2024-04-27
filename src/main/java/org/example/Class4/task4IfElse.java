package org.example.Class4;

public class task4IfElse {
    public static void main(String[] args) {
        boolean degree=false;
        double gpa=3.9;

        if ((degree)){
            System.out.println("Congratulations on your degree");

            if (gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("you should have studied harder");
            }

        }else {
            System.out.println("you should get a degree");
        }

    }//end of main

}//end of class
