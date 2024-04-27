package org.example.Class19_Method_Overloading;

public class BrowserTester_2 {
    public static void main(String[] args) {

        Browser [] arr = {new Chrome(),new Firefox(),new Safari()};

        for ( int i = 0; i < arr.length; i++){
            Browser b =arr [i];
            b.openBrowser();
            b.openWebsite();
            b.performTesting();
            b.closeBrowser();

        }



    }
}

