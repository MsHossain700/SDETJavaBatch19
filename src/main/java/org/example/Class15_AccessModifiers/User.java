package org.example.Class15_AccessModifiers;

public class User {
    private String useName;
    String Password;

    public String name;
    public int age;

    private void displayUserName(){
        System.out.println(useName);

    }
    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {

        User u1 = new User();
        u1.useName="username123";
        u1.Password="pass123";
        u1.displayUserName();


    }


}
