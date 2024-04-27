package org.example.Class27_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E9_Try_Catch {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\TEMP.Hossain-PC\\Desktop\\idk\\SDETJavaBatch19\\Files\\Batch19TestData.xlsx");
        }catch (FileNotFoundException f){
            System.out.println("Backup code");
        }


    }//end of main
}//end of class
