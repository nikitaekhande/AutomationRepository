package org.LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class Basic3MethodsExa {
    public static void main(String args[]) {
        String bName = "ch";
        String url = "https://demoqa.com/radio-button";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        //this methos is used to verify the particular webelement is displayed or not if it is displayed it will printl true otherwise print false
        WebElement ele = driver.findElement(By.cssSelector("label[for='yesRadio'"));
        System.out.println("isDisplayed :" + ele.isDisplayed());
        ele.click();
//if we click on yes btn then it will diplay true otherwise false
        WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));
        boolean isSelected = yesRadioBtn.isSelected();
        System.out.println("isSelected : " + isSelected);
//verify particular web element is enabled or not

        WebElement noRadoBtn = driver.findElement(By.id("noRadio"));
        System.out.println("isEnabled : " + noRadoBtn.isEnabled());


    }
}
