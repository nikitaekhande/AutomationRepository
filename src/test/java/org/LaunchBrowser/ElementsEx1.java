package org.LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.util.List;

public class ElementsEx1 {
    public static void main(String args[]) {
        String bName = "ch";
        String url = "http://127.0.0.1:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        // WebElement ele = driver.findElement(By.id("username123"));
        List<WebElement> allele = driver.findElements(By.id("username123"));
        System.out.println(" Size =" + allele.size());
        System.out.println("isEmpty = " + allele.isEmpty());

    }

}
