package org.example.Class19_Method_Overloading;

public class BrowserTester {
    public static void main(String[] args) {


        Chrome chrome= new Chrome();
        chrome.openBrowser();
        chrome.openWebsite();
        chrome.performTesting();
        chrome.closeBrowser();

        Firefox firefox= new Firefox();
        firefox.openBrowser();
        firefox.openWebsite();
        firefox.performTesting();
        firefox.closeBrowser();

        Safari safari= new Safari();
        safari.openBrowser();
        safari.openWebsite();
        safari.performTesting();
        safari.closeBrowser();


    }
}
