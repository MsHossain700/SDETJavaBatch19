package org.example.Class11_StringClass;

import java.util.Scanner;

public class Task_5_With_Scanner {
    public static void main(String[] args) {

        /*
        Write a program that reads two people's first names and if
        they are expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */
        Scanner scanner = new Scanner(System.in);

        // Prompt for mom's first name
        System.out.print("Mom’s first name? ");
        String momName = scanner.nextLine();

        // Prompt for dad's first name
        System.out.print("Dad’s first name? ");
        String dadName = scanner.nextLine();

        // Prompt for baby gender
        System.out.print("Boy or Girl? ");
        String gender = scanner.nextLine().toLowerCase();

        // Generate suggested baby name based on gender
        String suggestedName = generateBabyName(momName, dadName, gender);

        // Print suggested baby name
        System.out.println("Suggested baby name: " + suggestedName);
    }

    public static String generateBabyName(String momName, String dadName, String gender) {
        String suggestedName = "";

        // Extract portions of mom and dad's names for combination
        String momPart = momName.substring(0, (momName.length() + 1) / 2);
        String dadPart = dadName.substring((dadName.length() + 1) / 2);

        // Suggest name based on gender
        if (gender.equals("boy")) {
            suggestedName = dadPart + momPart.toLowerCase();
        } else if (gender.equals("girl")) {
            suggestedName = momPart + dadPart.toLowerCase();
        }
        // Capitalize the first letter of the suggested name
        suggestedName = suggestedName.substring(0, 1).toUpperCase() + suggestedName.substring(1);
        return suggestedName;
    }

}//end of class
