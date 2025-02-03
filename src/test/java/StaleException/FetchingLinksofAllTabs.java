package StaleException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.util.List;

public class FetchingLinksofAllTabs {
    public static  void main(String args[]) throws InterruptedException
    {
        String bName ="ch";
        String url ="http://127.0.0.1:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
        WebElement login = driver.findElement(By.xpath("//a[@id=\"loginButton\"]"));
        login.click();
        gu.waitForVisibilityByType(driver,10,"id","logoutLink");
        List<WebElement> tabNames = driver.findElements(By.cssSelector("td[class=\"navItem relative\"]  div[class=\"label\"]"));
        List<WebElement>  tabLinks = driver.findElements(By.cssSelector("td[class=\"navItem relative\"]>a"));
        int tabsize = tabLinks.size();
        for(int i=0;i<tabsize; i++) {
            WebElement eles = tabLinks.get(i);
            System.out.println(tabLinks.get(i).getAttribute("class"));
        }

    }
}
