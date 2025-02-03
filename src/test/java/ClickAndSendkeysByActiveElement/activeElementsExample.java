package ClickAndSendkeysByActiveElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class activeElementsExample {
    public static void main (String args[])
    {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://127.0.0.1:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        driver.switchTo().activeElement().sendKeys("admin");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("manager");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);

        System.out.println("** Program Ends **");
    }
    }
