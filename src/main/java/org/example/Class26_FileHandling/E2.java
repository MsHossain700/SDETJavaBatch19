package org.example.Class26_FileHandling;

import org.example.Utils.ConfigReader;

import java.io.IOException;

public class E2 {
    public static void main(String[] args) throws IOException {

        String value = ConfigReader.read("url","C:\\Users\\TEMP.Hossain-PC\\Desktop\\idk\\SDETJavaBatch19\\Files\\Config.Properties");
        System.out.println(value);


    }//end of main
}//end of class
