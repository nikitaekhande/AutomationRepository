package TestNG.parallelTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.GenericUtility;

public class parallelEx1 {
    @Test
    public  void googleEx(){
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch" ,"https://www.google.com/" );
        driver.quit();
    }
    @Test
    public void facebookEx(){
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch" ,"https://www.facebook.com/");
        driver.quit();
    }
}
