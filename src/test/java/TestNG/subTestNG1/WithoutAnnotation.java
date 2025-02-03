package TestNG.subTestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.util.Properties;

public class WithoutAnnotation {
    @Test
    public void verifyLoginPageTitle() {
        ConfigReader cr = new ConfigReader();
        Properties prop = cr.getPropObj();
//Launch Browser
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("url"));
        //get the actual title
        String actTitle = driver.getTitle();
        //verify the title

        String expTitle = "actiTIME - Login";
        if (expTitle.equals(actTitle)) {
            System.out.println("Login title is as expected.");
        } else {
            System.out.println("Login title is NOT as expected.");
        }
    }

    //verify url
    @Test
    public void verifyurl() {
        ConfigReader cr = new ConfigReader();
        Properties prop = cr.getPropObj();
//Launch Browser
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("url"));
        String Acturl = driver.getCurrentUrl();
        String ExpectedUrl = "http://127.0.0.1:82/login.do";
        if (ExpectedUrl.equals(Acturl)) {
            System.out.println("Url is expected ");
        } else {
            System.out.println("url not as expected");
        }
    }
        @Test
        public void verifyLoginFunctionality() {
            //Read the Properties file
            ConfigReader cr = new ConfigReader();
            Properties prop = cr.getPropObj();

            //Launch the browser & URL
            GenericUtility gu = new GenericUtility();
            WebDriver driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("url"));

            //Enter user name
            driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(prop.getProperty("uName"));
            //Enter password
            driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(prop.getProperty("pwd"));
            //Click on login button
            driver.findElement(By.cssSelector("a[id=\"loginButton\"]")).click();


            //verify dashboard page is displayed
            //way 1:
            /*
            WebElement ttTab = driver.findElement(By.xpath("//a[@class='content selected tt']/div[text()='TIME-TRACK']"));
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
            driver.findElement(By.id("logoutLink")).click();

            //close the browser
            driver.quit();
        }



    }

