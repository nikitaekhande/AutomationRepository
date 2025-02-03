package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class frameExample3 {
    public static void main(String args[]){
        System.out.println("Start programs");
        String bName = "ch";
        String url = "https://demoqa.com/nestedframes";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);
        WebElement  frameEle1 =driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frameEle1);

        WebElement frameEle2 = driver.findElement(By.cssSelector("iframe[srcdoc]"));
        driver.switchTo().frame(frameEle2);
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        System.out.println("ends program");



    }
}
