package org.LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class GetAttributeEx2 {
    public static void main(String args[]) {
        String bName = "ch";
        String url = "http://127.0.0.1:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        //way  1
        WebElement loginattrival = driver.findElement(By.id("loginBox"));
        String value = loginattrival.getAttribute("id");
        System.out.println(value);
        //way 2
        String val2 = loginattrival.getDomAttribute("id");
        System.out.println(val2);
    }
}
