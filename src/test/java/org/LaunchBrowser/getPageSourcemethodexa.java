package org.LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class getPageSourcemethodexa {
    public static void main(String args[]) {
        System.out.println("programs start");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "  http://127.0.0.1:82/login.do");
        String str = driver.getPageSource();
        System.out.println(str);

    }
}
