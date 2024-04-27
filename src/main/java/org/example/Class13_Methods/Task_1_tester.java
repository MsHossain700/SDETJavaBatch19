package org.example.Class13_Methods;

import java.util.Scanner;

public class Task_1_tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your email type: ");
        String emailType = scanner.nextLine();

        String email = createEmail(firstName, lastName, emailType);
        System.out.println("Your email address is: " + email);

        scanner.close();
    }

    public static String createEmail(String firstName, String lastName, String emailType) {
        String completeEmail = firstName.toLowerCase() + lastName.toLowerCase() + "@" + emailType.toLowerCase() + ".com";
        return completeEmail;


    }//end of main
}//end of class
