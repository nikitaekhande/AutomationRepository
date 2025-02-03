package TestNG.subTestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.util.Properties;

public class WithAnnotation {
        WebDriver driver;           //global object
        Properties prop;

        @BeforeMethod
        public void initBrowser() {
            //Read the Properties file
            ConfigReader cr = new ConfigReader();
            prop = cr.getPropObj();

            //Launch the browser & URL
            GenericUtility gu = new GenericUtility();
            driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("url"));
        }
        @AfterMethod
        public void closeBrowser() {
            //close the browser
            driver.quit();
        }
        @Test
        public void verifyLoginPageTitle() {
            //get the actual title
            String actTitle = driver.getTitle();
            //verify the title
            String expTitle = "actiTIME - Login";
            if(expTitle.equals(actTitle)) {
                System.out.println("Login title is as expected.");
            } else {
                System.out.println("Login title is NOT as expected.");
            }
        }
        @Test
        public void verifyLoginPageURL() {
            //get the actual URL
            String actURL = driver.getCurrentUrl();
            //verify the title
            String expURL = "http://127.0.0.1:82/login.do";
            if(expURL.equals(actURL)) {
                System.out.println("Login URL is as expected.");
            } else {
                System.out.println("Login URL is NOT as expected.");
            }
        }
        @Test
        public void verifyLoginFunctionality() {
            //Enter user name
            driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(prop.getProperty("uName"));
            //Enter password
            driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(prop.getProperty("pwd"));
            //Click on login button
            driver.findElement(By.cssSelector("a[id=\"loginButton\"]")).click();

            //verify dashboard page is displayed
            //way 1:
            /*
            WebElement ttTab = driver.findElement(By.xpath("a[class=\"item active\"]"));
            if(ttTab.isDisplayed()) {
                System.out.println("Dashboard page is displayed.");
            } else {
                System.out.println("Dashboard page is NOT displayed.");
            }
            //way 2:
        /*List<WebElement> ttTab = driver.findElements(By.xpath("//a[@class='content selected tt']/div[text()='TIME-TRACK']"));
        if(!ttTab.isEmpty()) {
            System.out.println("Dashboard page is displayed.");
        } else {
            System.out.println("Dashboard page is NOT displayed.");
        }*/

            //logout
            //driver.findElement(By.id("logoutLink")).click();
        }
    }

