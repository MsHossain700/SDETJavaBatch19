package org.example.Review_10;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2_ConfigurationFile {
    public static void main(String[] args) {

        String path = System.getProperty("user.dir")+"\\Files\\config.properties";

        try {
        FileInputStream fileInputStream = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fileInputStream);

            System.out.println(properties.getProperty("url"));

        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }


    }//end of main
}//end of class
