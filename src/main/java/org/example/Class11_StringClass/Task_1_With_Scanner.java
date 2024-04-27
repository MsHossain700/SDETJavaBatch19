package org.example.Class11_StringClass;

import java.util.Scanner;

public class Task_1_With_Scanner {
    public static void main(String[] args) {

        /*
        Store username, password and confirm password from a user and check following requirements:

Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter user name: ");
        String userName = scan.nextLine();
        System.out.print("Please enter password: ");
        String password = scan.nextLine();
        System.out.print("Please renter password: ");
        String confirmPassword = scan.nextLine();
        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("User and Password Can not be empty");
        } else if (password.length() < 8) {
            System.out.println("Password too short");
        } else if (password.contains(userName)) {
            System.out.println("Password Cannot contain username");
        } else if (!password.equals(confirmPassword)) {
            System.out.println("Password Do Not match");
        } else {
            System.out.println("Your username and password has been created");
        }

    }//end of main
}//end of class
