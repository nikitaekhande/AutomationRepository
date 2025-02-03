package org.LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class checkWheatherActAndExpURLsameOrNot {
    public static void main(String args[]) {
        System.out.println("programs start");
        String browserNmae = " ch ";
        GenericUtility gu = new GenericUtility();
        //   WebDriver driver =  gu.startUp("ch" , "https://www.google.com/");

        WebDriver driver = gu.startUp("ch", "http://127.0.0.1:82/login.do");
        String ActTitle = driver.getTitle();
        String ExpectTitle = "actiTIME - Login";


        if (ActTitle.equals(ExpectTitle)) {
            System.out.println("Title is as expected ");
        } else {
            System.out.println("Title is not as expected");
        }

        String ACtURL = driver.getCurrentUrl();
        System.out.println("acturl" + ACtURL);
        System.out.println("programs ends");
    }
}
