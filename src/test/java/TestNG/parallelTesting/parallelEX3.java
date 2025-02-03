package TestNG.parallelTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.GenericUtility;

public class parallelEX3 {
    @Test
    public void automationtestingEx(){
        GenericUtility gu = new GenericUtility();
        WebDriver driver =  gu .startUp("ch","https://demo.automationtesting.in/Register.html");
        driver.quit();
    }
}
