package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class frameExample {
    public static void main(String args[]){
        System.out.println("Start programms ");
        String bName ="ch";
        String url ="https://demoqa.com/frames";
        GenericUtility gu = new GenericUtility();
        WebDriver driver =gu.startUp(bName,url);
        WebElement ele =driver.findElement(By.id("sampleHeading"));
        String txt = ele.getText();
        System.out.println("TEXT :" +txt);
        System.out.println("ends programs ");
    }
}
