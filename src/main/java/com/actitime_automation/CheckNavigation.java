package com.actitime_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckNavigation {
    public static void main(String [] args)
    {
        WebDriver driver = new ChromeDriver();
        //navigate to redbus
        driver.navigate().to("https://www.redbus.in/");
        String parentId=driver.getWindowHandle();
        WebElement help = driver.findElement(By.xpath("//span[text()='Help']"));
        //navigate to help icon
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.redbus.in/info/redcare");
        //driver.findElement(By.xpath("//span[text()='Help']")).click();
        //System.out.println(driver.getTitle());
        String title1= "red:Care";
        String title2=driver.getTitle();
        if(title2.equals(title1))
        {
            System.out.println("Successfully landed on second page of RedBus.");
        }
        else
        {
            System.out.println("Failed to navigate");
        }
        driver.close();

        //Switch back to first tab
        driver.switchTo().window(parentId);
        String currenturl = "https://www.redbus.in/";
        if(driver.getCurrentUrl().equals(currenturl))
        {
            System.out.println("Successfully landed on first tab");
        }
        driver.close();

    }
}