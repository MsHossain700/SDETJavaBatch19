package org.example.Class14_Variables;

public class StudentsTester {
    public static void main(String[] args) {

        /*
       Create a Class called Students
        -Create three  variables  Name , ID  and  numberOfStudents
        -Create three objects of the Students Class
        -Set the value for  studentName , studentID and increment  the
         numberOfStudents for each object
        -Print out  total number of students
        */


        Students student1=new Students();

        student1.studentName="Mohammed";
        student1.studentID=123456;
        System.out.println(student1.studentName);
        System.out.println(student1.studentID);
        System.out.println(Students.numberOfStudent);

        Students student2=new Students();

        student2.studentName="Sahadat";
        student2.studentID=654321;
        System.out.println(student2.studentName);
        System.out.println(student2.studentID);
        System.out.println(Students.numberOfStudent);

        Students student3=new Students();

        student3.studentName="Hossain";
        student3.studentID=654321;
        System.out.println(student3.studentName);
        System.out.println(student3.studentID);
        System.out.println(Students.numberOfStudent);


    }//end of main
}//end of class
