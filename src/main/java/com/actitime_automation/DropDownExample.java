package com.actitime_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class DropDownExample {

    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        {
            driver.navigate().to("https://www.amazon.com/");
            //locate dropdown
            WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
            //create object of select class
            Select select = new Select(dropdown);
            //select vlaue  by text
            select.selectByVisibleText("Electronics");
            //eneter mob in search bar
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
            //click on search icon
            driver.findElement(By.id("nav-search-submit-button")).click();
            /*
          List <WebElement> mobileprice  =  driver.findElements(By.className("a-price-whole"));
          List<WebElement>  mobilename = driver.findElements(By.className("size-medium a-color-base aa-text-norma"));
         // System.out.println("mobile price:"+mobileprice);
        //  System.out.println("mobile name :"+mobilename);
          for (WebElement e : mobileprice){
             // System.out.println("mobile price:"+mobileprice);
              System.out.println("mobile price:"+e.getAttribute("class"));
          }

      //  for (WebElement e1 :mobilename){
           // System.out.println("mobile name :"+mobilename);
           //  System.out.println("Mobile name :" +e1.getText());
         // }


        }
        driver.close();

             */

        }
    }
}