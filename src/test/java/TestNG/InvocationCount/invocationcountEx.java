package TestNG.InvocationCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.util.Properties;

public class invocationcountEx {
 @Test(invocationCount = 3 ,threadPoolSize = 2)
    public  void verifyloginfunctionality(){
     ConfigReader cr = new ConfigReader();
     Properties prop = cr.getPropObj();
     GenericUtility gu = new GenericUtility();
     WebDriver driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("url"));
  driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("admin");
  driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys("manager");
  driver.findElement(By.cssSelector("a[id=\"loginButton\"]")).click();

 }
}
