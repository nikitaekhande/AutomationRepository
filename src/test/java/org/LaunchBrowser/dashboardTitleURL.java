package org.LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.GenericUtility;

import java.time.Duration;

public class dashboardTitleURL {
    public static void main(String args[]) {
        System.out.println("program start");
        String bName = "ch";
        String url = "http://127.0.0.1:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        // driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
        driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
        //title
        wt.until(ExpectedConditions.titleContains("Enter Time-Track")); //partial title
        wt.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));//exact title

        String EXpTitle = "actiTIME - Enter Time-Track";
        String actTitle = driver.getTitle();
        if (EXpTitle.equals(actTitle)) {
            System.out.println("Dashboard Title as expected ");
        } else {
            System.out.println("Dashboard title is not expected ");
        }
        //url
        WebDriverWait wt2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wt2.until(ExpectedConditions.urlContains("submit_tt.do"));//partial url
        wt2.until(ExpectedConditions.urlToBe("http://127.0.0.1:82/user/submit_tt.do")); //exact url
        String Expeurl = "http://127.0.0.1:82/user/submit_tt.do";
        String actualurl = driver.getCurrentUrl();
        if (Expeurl.equals(actualurl)) {
            System.out.println("url is expected as actual url");
        } else {
            System.out.println("url is not expected as actual url");
        }
        System.out.println("program ends");


    }
}
