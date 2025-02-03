package TestNG.parameterEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.util.Properties;

public class parameterEx {
    @Parameters({"username", "password"})
    @Test
    public void verifyLoginFunctionality(String uName, String pwd) {
        ConfigReader cr = new ConfigReader();
        Properties prop = cr.getPropObj();
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("url"));
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys(uName);
        driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys(pwd);
        driver.findElement(By.cssSelector("a[id=\"loginButton\"]")).click();

        /*
        WebElement ttTab = driver.findElement(By.xpath(" a[class=\"content tt_selected selected\"] div[class=\"label\"]"));
        if(ttTab.isDisplayed()) {
            Reporter.log("Dashboard page is displayed.");
        } else {
            Reporter.log("Dashboard page is NOT displayed.");
        }
        driver.findElement(By.cssSelector("a[id=\"logoutLink\"]")).click();
        driver.quit();
    }
    */

    }
}

