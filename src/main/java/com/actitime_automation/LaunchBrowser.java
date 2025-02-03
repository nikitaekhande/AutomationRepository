package com.actitime_automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://redbus.in");
        String title = driver.getTitle();
        System.out.println(title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        driver.close();
    }
}
