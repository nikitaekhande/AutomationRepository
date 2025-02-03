package com.actitime_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElementExample {
    public static  void main(String [] arg){
        boolean redCheckbox ;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        redCheckbox =  driver.findElement(By.xpath("//input[@value = 'red']")).isSelected();
        System.out.println(redCheckbox);
        driver.findElement(By.xpath("//input[@value = 'red']")).click();
        redCheckbox =driver.findElement(By.xpath("//input[@value = 'red']")).isSelected();
        System.out.println(redCheckbox);
        driver.get("https://www.redbus.in/");
        String srcvalue = driver.findElement(By.xpath("//img[contains(@title , 'Online Bus ')]")).getAttribute("src");
        System.out.println(srcvalue);
        driver.close();
    }
}
