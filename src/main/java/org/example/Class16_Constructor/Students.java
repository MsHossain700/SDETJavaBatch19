package org.example.Class16_Constructor;

public class Students {

    /*
    Write a java Class Students that have a constructor which takes
    students name and 3 subject grades. Inside your class also have a
    method to Calculate Average Grade. Test Task_1_Student class for 2 different
    students with different marks. Your program should print an average
    mark of each student's name.
    NOTE: please use different names for instance and local variables.
     */

    private String studentName;
    private double grade1;
    private double grade2;
    private double grade3;

    public Students(String name, double eGrade1, double eGrade2, double eGrade3) {
        studentName = name;
        grade1 = eGrade1;
        grade2 = eGrade2;
        grade3 = eGrade3;
    }

    public double averageGrade() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public static void main(String[] args) {

        Students s1 = new Students("Will", 95.5, 90.5, 80.0);
        Students s2 = new Students("Asghar", 55.0, 45.5, 75.0);

        System.out.println("Average mark for " + s1.studentName + ": " + s1.averageGrade());
        System.out.println("Average mark for " + s2.studentName + ": " + s2.averageGrade());


    }


}//end of class
