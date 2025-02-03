package TestNG.PageObjectModel.POM_TestCases;

import TestNG.PageObjectModel.POM_Pages.loginpage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.util.Properties;

public class LoginTC {
    WebDriver driver;
    Properties prop;

    @BeforeMethod
    public void initBrowser() {
        ConfigReader cr = new ConfigReader();
        prop = cr.getPropObj();
        GenericUtility gu = new GenericUtility();
        driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("url"));
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
    @Test
    public void verifyloginFunctionality()
        {
        loginpage  obj = new loginpage(driver);
        obj.enterUserName(prop.getProperty("uName"));
        obj.enterPassword(prop.getProperty("pwd"));
        obj.clickOnLoginBtn();
    }
    @Test
    public void verifyLoginPageFields() {
        System.out.println("** Verify Login Page Fields.");
        loginpage Obj = new loginpage(driver);
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(Obj.isUserNameFieldDisplayed(), "User name field is not displayed.");
        sa.assertTrue(Obj.isPasswordFieldDisplayed(), "Password field is not displayed.");
        sa.assertTrue(Obj.isKeepMeLoginCheckboxDisplayed(), "Keep Me login checkbox is not displayed.");
        sa.assertTrue(Obj.isLoginBtnDisplayed(), "Login button is not displayed.");
       // sa.assertTrue(Obj.areLoginLogosDisplayed(), "Login logos are not displayed.");
        sa.assertAll();
        System.out.println("Login Page fields are displayed as expected.");
    }

}