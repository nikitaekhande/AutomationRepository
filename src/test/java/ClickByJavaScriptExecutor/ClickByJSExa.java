package ClickByJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class ClickByJSExa {
    public static void main(String args[]){
        System.out.println("start program ");
        String bName ="ch";
        String url ="http://127.0.0.1:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver  driver = gu.startUp(bName,url);
        WebElement yesradiobtn = driver.findElement(By.id("loginButton"));
       // yesradiobtn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",yesradiobtn);
        System.out.println("ends  program");
    }
}
