package org.LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class BrowserOperationsEx {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Start programs");
        String bName = "ch";
        String url = "http://127.0.0.1:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        Thread.sleep(1000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println("ends program");
    }

}
