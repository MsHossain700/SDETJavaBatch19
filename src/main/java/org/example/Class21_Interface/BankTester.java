package org.example.Class21_Interface;

public class BankTester {
    public static void main(String[] args) {
        BankAccount B = new BankAccount("Sahadat","User123","password");
        System.out.println(B.getName());
        B.setName("Hossain");
        System.out.println(B.getName());
    }
}
