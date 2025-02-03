package org.LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.util.List;

public class ElementsEx2 {
    public static void main(String args[]) {
        System.out.println("Start program");
        String bName = "ch";
        String url = "http://127.0.0.1:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
        driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
        gu.waitForVisibilityByType(driver, 10, "id", "logoutLink");
        List<WebElement> tabsname = driver.findElements(By.cssSelector("#topnav.label"));
        WebElement ele1 = tabsname.get(0);


    }
}
