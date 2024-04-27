package org.example.Class10_OOPS;

public class BankUser {

    String fullName;
    double accountBalance;
    String userName;
    String passWord;
    int age;
    boolean isSavingsAccount;

    void deposit(){
        System.out.println("Depositing funds");
    }

    void transferFunds(){
        System.out.println("Sending money to other account");
    }

    void withdraw(){
        System.out.println("Withdrawing funds....");
    }
}//end of class
