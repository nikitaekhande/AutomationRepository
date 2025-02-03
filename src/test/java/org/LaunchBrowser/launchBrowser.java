package org.LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class launchBrowser {
    public static void main(String args[]) {
        System.out.println("Start program ");
        GenericUtility gu = new GenericUtility();
        //  WebDriver driver= gu.startUp("ch" ,"https://www.Google.com");
        WebDriver driver = gu.startUp("ch", "");
    }
}
