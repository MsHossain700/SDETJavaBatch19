package org.example.Class19_Method_Overloading;

public class StudentTester {
    public static void main(String[] args) {

        Student [] arr = {new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for ( int i = 0; i < arr.length; i++){
            Student s =arr [i];
            s.Uniform();
            s.Textbooks();
            s.Transportation();
            s.Tuition();

        }

    }
}
