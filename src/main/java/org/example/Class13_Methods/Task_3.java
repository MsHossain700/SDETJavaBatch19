package org.example.Class13_Methods;

public class Task_3 {

    /*
    write a method for score >90 = A, >80= B, >70= C, >50= C.
     */
    char getGrade(int score){
        //using if else because it had relational operator. can't use switch
        if(score > 90){
            return 'A';
        }else if(score > 80){
            return 'B';
        }else if(score > 70){
            return 'C';
        }else if(score > 50){
            return 'D';
        }else{
            return 'F';
        }
    }

}//end of class
