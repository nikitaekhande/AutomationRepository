package WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.utilities.GenericUtility;

import java.time.Duration;

public class ActitimeLoginexa1onwait {
    public static  void  main(String args[]){
        String bName = "ch";
        String url = "http://127.0.0.1:82/login.do";
        ActitimeLoginexa1onwait obj = new ActitimeLoginexa1onwait();
        obj.elementPractice(bName ,url);
    }

    public void elementPractice(String bName, String url) {

        System.out.println("start program");
        GenericUtility gu = new GenericUtility();

        WebDriver driver = gu.startUp(bName,url);
        //implicit wait
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
        WebElement login = driver.findElement(By.xpath("//a[@id=\"loginButton\"]"));
        login.click();
        //explicit wait
      //  WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(90));
       //  wt.until(ExpectedConditions.visibilityOf(login));
        // wt.until(ExpectedConditions.invisibilityOf(login));
        //fluent wait
        FluentWait <WebDriver> fw = new FluentWait<>(driver);
        fw.withTimeout(Duration.ofSeconds(10));
        fw.pollingEvery(Duration.ofMillis(200));
        fw.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
        fw.ignoring(Exception.class);
        driver.findElement(By.id("logoutLink")).click();
      // driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
        System.out.println("ends program");




    }
}
