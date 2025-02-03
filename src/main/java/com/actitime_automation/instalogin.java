package com.actitime_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class instalogin {
    public  static void main(String[] args) throws  InterruptedException{
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/");
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("__nikita_ekhande");
        driver.findElement(By.name("password")).sendKeys("nikita@311");
        driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }

}

