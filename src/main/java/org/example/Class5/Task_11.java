package org.example.Class5;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter Quiz grade: ");
        double quizGrade = scanner.nextDouble();
        System.out.print("Please enter Mid term grade: ");
        double midtermGrade = scanner.nextDouble();
        System.out.print("Please enter Final grade: ");
        double finalGrade = scanner.nextDouble();

        double averageGrade = (quizGrade + midtermGrade + finalGrade)/3;

        if (averageGrade >= 90) {
            System.out.println("You get a grade A");
        } else if (averageGrade >= 70 && averageGrade < 90) {
            System.out.println("You get a grade B");
        } else if (averageGrade >= 50 && averageGrade < 70) {
            System.out.println("You get a grade C");
        } else if (averageGrade < 50) {
            System.out.println("You get a grade D");
        } else {
            System.out.println("Wrong grade");
        }
    }//end of main

}//end of class
