package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class DDhandlingExample2 {

    public static void main(String args[]){
        System.out.println("Start program ");
        String bName = "ch";
        String url ="https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);
         WebElement ele =driver.findElement(By.cssSelector("select[id='oldSelectMenu']"));
         ele.click();
       // driver.switchTo().activeElement().sendKeys(Keys.ENTER);
         WebElement clickonele = driver.findElement(By.xpath("//option[text() ='Blue']"));
         clickonele.click();
      //  driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        System.out.println("ends programs ");
    }
}
