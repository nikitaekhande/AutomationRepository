package org.LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleExample {
    public static void main(String args[]) throws InterruptedException {
        String bName = "ch";
        String url = "https://demoqa.com/browser-windows";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        String parentID1 = driver.getWindowHandle();
        System.out.println("parentID1 " + parentID1);
        driver.findElement(By.xpath("//button[@id ='tabButton']")).click();
        Set<String> allwindowID = driver.getWindowHandles();
        Iterator<String> itr = allwindowID.iterator();
        while (itr.hasNext()) {
            String windowId = itr.next();
            if ((windowId.equals(parentID1))) {
                windowId = itr.next();
            }
            //if we want to switch to parentid to  child id
            driver.switchTo().window(windowId);
            driver.close();

            //if want to perform some operations on parent window then switch back to it.
            driver.switchTo().window(parentID1);

        }


    }
}
