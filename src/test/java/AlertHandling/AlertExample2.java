package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.GenericUtility;

import java.time.Duration;

public class AlertExample2 {
    public  static void main (String args[]){
        String bName = "ch";
        String url = "https://demoqa.com/alerts";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu .startUp(bName , url);
        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wt = new WebDriverWait(driver , Duration.ofSeconds(10));
        wt.until(ExpectedConditions.alertIsPresent());
        Alert alt = driver.switchTo().alert();
        String txt = alt.getText();
        System.out.println("alert text :" +txt);
        alt.accept();
    }
}
