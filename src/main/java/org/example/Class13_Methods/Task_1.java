package org.example.Class13_Methods;

public class Task_1 {
    /*
    Create a method createEmail(). Based on values of users firstName,
    lastName and email type, your method should return a complete email
    address. example: createEmail(John, Snow, gmail) johnsnow@gmail.com
     */

    String createEmail(String firstName, String lastName, String emailType) {
        String completeEmail = firstName.toLowerCase() + lastName.toLowerCase() + "@" + emailType.toLowerCase() + ".com";
        System.out.println(completeEmail);
        return completeEmail;
    }

}//end of class
