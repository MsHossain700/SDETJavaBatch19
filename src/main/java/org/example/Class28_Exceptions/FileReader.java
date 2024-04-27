package org.example.Class28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

        static void read () throws FileNotFoundException {

            FileInputStream fis = new FileInputStream("path");

        }
    }
