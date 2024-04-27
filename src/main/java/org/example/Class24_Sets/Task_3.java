package org.example.Class24_Sets;

import java.util.HashSet;
import java.util.Set;

public class Task_3 {
    /*
Create a Set that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student.
 */

        private String name;
        private int studentID;

        public void Student(String name, int studentID) {
            this.name = name;
            this.studentID = studentID;
        }
        public String getName() {
            return name;
        }
        public int getId() {
            return studentID;
        }
    }
    class StudentTester {
        public static void main(String[] args) {

            Set<Student> studentSet = new HashSet<>();

            studentSet.add(new Student("Taisia", 1001));
            studentSet.add(new Student("Nikola", 1002));
            studentSet.add(new Student("Will", 1003));

            for (Student student : studentSet) {
                System.out.println("Name: " + student.getName()+" ID: "+ student.getStudentID());
            }
        }

    }


