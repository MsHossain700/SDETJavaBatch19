package org.example.Class4;

public class task5NestedIfElse {
    public static void main(String[] args) {
        double mortgageRate=3.5;
        int mortgagePrice=200000;

        if ((mortgageRate<4.5)){
            System.out.println("User will consider buying");
            if (mortgagePrice>=100000){
                System.out.println("User will take a loan");
            }else{
                System.out.println("User will pay cash");
            }
        }else {
            System.out.println("User will not buy a house");
        }


    }//end of main
}//end of class
