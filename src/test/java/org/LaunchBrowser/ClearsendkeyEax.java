package org.LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class ClearsendkeyEax {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("start program ");
        String bName = "ch";
        String url = "https://demoqa.com/webtables";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        driver.findElement(By.xpath("//div[text()='Cierra']/following-sibling::div//span[@title='Edit']/*")).click();
        WebElement firstName = driver.findElement(By.id("firstName"));
        // firstName.clear();
        // firstName.sendKeys("Nikita");
        // System.out.println("ends programs");
        firstName.click();
        Thread.sleep(2000);
        firstName.sendKeys(Keys.chord(Keys.CONTROL, "a"));//clt+A
        Thread.sleep(2000);
        firstName.sendKeys(Keys.DELETE);        //delete the selected text
        Thread.sleep(2000);
        firstName.sendKeys("Akshay");
        System.out.println("** Program Ends **");

    }
}
