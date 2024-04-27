package org.example.Class26_FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1_ConfigReader {
    public static void main(String[] args) throws IOException {

        // Location of the file
        String path="C:\\Users\\TEMP.Hossain-PC\\Desktop\\idk\\SDETJavaBatch19\\Files\\Config.Properties";
        //Navigate to the file or bring the file into the RAM
        FileInputStream fis = new FileInputStream(path);
        //A class which knows how the file works
        Properties properties = new Properties();

        properties.load(fis);

        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("passWord"));
        System.out.println(properties.getProperty("browser"));



    }//end of main
}//end of class
