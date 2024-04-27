package org.example.Class27_Exceptions;

import org.example.Utils.Constants;
import org.example.Utils.ExcelReader;

import java.io.IOException;

public class E2_ExcelReading {
    public static void main(String[] args) throws IOException {

        var data= ExcelReader.read(Constants.EXCEL_FILE_PATH,"sheet1");
        System.out.println(data);

        System.out.println("**********************");

        //to get specific set
        System.out.println(data.get(3));
        System.out.println(data.get(3).get("Age"));




    }//end of main
}//end of class
