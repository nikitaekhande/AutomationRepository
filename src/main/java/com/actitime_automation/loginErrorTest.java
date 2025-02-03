package com.actitime_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginErrorTest {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://profile.w3schools.com/login");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        if ((loginButton.isDisplayed()))
        {
            boolean value = loginButton.isEnabled();
            if (value)
            {
                loginButton.click();
            }
            else
            {
                throw new Exception("login button not enabled");
            }
        }
        else {
            Thread.sleep(5000);
            loginButton.click();
        }
        String loginButtonError = driver.findElement(By.xpath("//input[@name='email']")).getText();
        if (loginButtonError.equals("required")){
            System.out.println("succesfully verified the error msg for email");
        }
        else {
            System.out.println("the email error is not correct"+loginButtonError);
        }
        driver.close();
    }
}