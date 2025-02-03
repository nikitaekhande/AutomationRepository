package com.actitime_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class printmobprice {
    public static  void  main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        List<WebElement> mobName = driver.findElements(By.className("a-price-whole")); 
        System.out.println("mob name :" +mobName.size());

        for (WebElement e : mobName){
            System.out.println(e.getText());
        }


    }
}
