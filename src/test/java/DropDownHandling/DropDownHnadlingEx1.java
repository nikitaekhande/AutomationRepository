package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class DropDownHnadlingEx1 {
    public static void main(String args[]){
        System.out.println(" Start program ");
        String bName ="ch";
        String url ="https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);
        WebElement ddEle = driver.findElement(By.cssSelector("#withOptGroup div[class*='placeholder']"));
        ddEle.click();
        WebElement ele = driver.findElement(By.cssSelector("div[id='react-select-2-option-1-1']"));
         //ele.click();
        //if click method is not working then we use below options
        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
       // driver.switchTo().activeElement().sendKeys(Keys.ENTER);
         System.out.println(" Ends program ");













































































































    }
}
