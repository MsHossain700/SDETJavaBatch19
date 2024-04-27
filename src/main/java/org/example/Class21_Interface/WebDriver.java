package org.example.Class21_Interface;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser),
closeBrowser),
maximizeWindow,
findElement. Create 2 classes that implements WebDriver interface:
ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opened ChromeDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closed ChromeDriver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximized ChromeDriver");
    }

    @Override
    public void findElement() {
        System.out.println("Element found in ChromeDriver");
    }
}

class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opened FirefoxDriver");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closed FirefoxDriver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximized FirefoxDriver");
    }

    @Override
    public void findElement() {
        System.out.println("Element found in FirefoxDriver");
    }
}
