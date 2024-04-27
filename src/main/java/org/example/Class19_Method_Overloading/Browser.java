package org.example.Class19_Method_Overloading;

public class Browser {
    void openBrowser(){
        System.out.println("Opening Browser");
    }
    void openWebsite(){
        System.out.println("Loading the website");
    }
    void performTesting(){
        System.out.println("performing the testing ");
    }
    void closeBrowser(){
        System.out.println("Closing the Browser");
    }
}


class Chrome extends Browser{

    @Override
    void openBrowser(){
        System.out.println("Opening Google Chrome");
    }

    @Override
    void closeBrowser(){
        System.out.println("Closing Chrome");
    }
}

class Firefox extends Browser{

    @Override
    void openBrowser(){
        System.out.println("Opening Firefox");
    }

   @Override
    void closeBrowser(){
        System.out.println("Closing Firefox");
    }

}

class Safari extends Browser{

    @Override
    void openBrowser(){
        System.out.println("Opening Safari");
    }

    @Override
    void closeBrowser(){
        System.out.println("Closing Safari");
    }

}