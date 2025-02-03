package TestNG.PageObjectModel.POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.GenericUtility;

import java.util.List;

public class loginpage extends GenericUtility {
    private WebDriver driver;
    //elements
   @FindBy(css = "input[name=\"username\"]")
    private WebElement usernamefield;
    @FindBy(css = "input[name=\"pwd\"]")
    private WebElement passwordfield;
    @FindBy(css="a[id=\"loginButton\"]")
     private  WebElement loginfield;

    @FindBy(id="keepLoggedInLabel")
    private  WebElement keepmilogincheckbox;
    /*
    @FindBy(css="#logoContainer img")
    private List<WebElement> loginlogos;

     */
    //constructor
    public loginpage(WebDriver driver){
        PageFactory .initElements(driver,this);
        this.driver = driver;
    }
    //page Action method
    public void enterUserName(String uName) {
        usernamefield.sendKeys(uName);
    }
    public void enterPassword(String pwd) {
        passwordfield.sendKeys(pwd);
    }
    public void clickOnLoginBtn() {
        loginfield.click();
    }


    public boolean isUserNameFieldDisplayed() {
        return isElementPresents( usernamefield);
    }
    public boolean isPasswordFieldDisplayed() {
        return isElementPresents( passwordfield);
    }
    public boolean isKeepMeLoginCheckboxDisplayed() {
        return isElementPresents(keepmilogincheckbox);
    }
    public boolean isLoginBtnDisplayed() {
        return isElementPresents(loginfield);
    }
    /*
    public boolean areLoginLogosDisplayed() {
        for(int i=0; i<=2; i++) {
            if(!isElementPresents(loginlogos.get(i))) {
                return false;
            }
        }
        return true;
    }
    /*
     */



}
