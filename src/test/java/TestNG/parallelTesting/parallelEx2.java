package TestNG.parallelTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.GenericUtility;

public class parallelEx2 {
    @Test
    public  void  demoQA(){
        GenericUtility gu = new GenericUtility();
        WebDriver driver =gu.startUp("ch" ,"https://demoqa.com/");
        driver.quit();
    }
    @Test
    public void flipcartEx(){
        GenericUtility gu = new GenericUtility();
       WebDriver driver = gu.startUp("ch", "https://www.flipkart.com/");
       driver.quit();
    }
}
