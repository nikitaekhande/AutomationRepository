package org.LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class GetAttributeExa {
    public static void main(String args[]) {
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "  http://127.0.0.1:82/login.do");
        String attributevalue = driver.findElement(By.xpath("//a[@class='initial']")).getAttribute("id");
        System.out.println(attributevalue);


    }
}
