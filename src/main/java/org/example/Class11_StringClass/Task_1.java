package org.example.Class11_StringClass;

public class Task_1 {
    public static void main(String[] args) {

        /*
        Store username, password and confirm password from a user and check following requirements:

Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
         */
        String username="userName";
        String password="Password";

        int length=password.length();
        String confirmedPassword= password;
        if(username.isEmpty() || password.isEmpty()){
            System.out.println("username or password cannot be empty");
        }else if(length<8){
            System.out.println("Password is too short");
        }else if (password.contains(username)){
            System.out.println("Password cannot contain username");
        }else if(!password.equals(confirmedPassword)){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");
        }



    }//end of main
}//end of class
