package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class FrameExample2 {
    public  static void main(String args[]){
        System.out.println("Start program");
        String bName ="ch";
        String url = "https://demoqa.com/frames";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);
        WebElement frameEle = driver.findElement(By.id("frame1"));
        driver.switchTo().frame("frame2");
        WebElement ele = driver.findElement(By.id("sampleHeading"));
        String txt = ele.getText();
        System.out.println("Text : " +txt);
        System.out.println("ends program ");
    }
}
