package ActionClassExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.GenericUtility;
public class ActionclassEX1 {
    public static void main(String args[]) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://127.0.0.1:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        WebElement userfield = driver.findElement(By.cssSelector("input[name=\"username\"]"));
           Actions act = new Actions(driver);
           act.sendKeys(userfield,"admin").perform();
           WebElement pwdfield = driver.findElement(By.cssSelector("input[name=\"pwd\"]"));
           act.sendKeys(pwdfield,"manager").perform();
        WebElement loginBtn = driver.findElement(By.cssSelector("a[id=\"loginButton\"]"));
        act.click(loginBtn).perform();


    }
}
