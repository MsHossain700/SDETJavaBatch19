package org.example.Class10_OOPS;

public class BankUserTester {
    public static void main(String[] args) {

        BankUser mattObject= new BankUser();

        mattObject.fullName="Matt";
        mattObject.age=30;
        mattObject.isSavingsAccount=false;
        mattObject.accountBalance=300000;
        mattObject.userName="Biden123";
        mattObject.passWord="Pass123";

        System.out.println(mattObject.fullName);
        System.out.println(mattObject.age);
        System.out.println(mattObject.accountBalance);
        mattObject.deposit();
        mattObject.transferFunds();
    }//end of main
}//end of class
