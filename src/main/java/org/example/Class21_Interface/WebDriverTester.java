package org.example.Class21_Interface;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser),
closeBrowser),
maximizeWindow,
findElement. Create 2 classes that implements WebDriver interface:
ChromeDriver and FirefoxDriver.
 */

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] WebDrivers ={new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver WD:WebDrivers  ){
            WD.openBrowser();
            WD.closeBrowser();
            WD.maximizeWindow();
            WD.findElement();
        }
    }
}
