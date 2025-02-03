package AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class AutoIT {
    public static  void main(String args[])throws InterruptedException{
        String bName = "ch";
        String url ="https://demoqa.com/automation-practice-form";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);
        gu.scrollByPageDown(driver,1);
        Thread.sleep(2000);
        WebElement Uplodbtn = driver.findElement(By.cssSelector("input[id=\"uploadPicture\"]"));
     //   Uplodbtn.click();
        gu.clickByActions(driver,Uplodbtn);
       // String fileName = System.getProperty("user.dir") + "\\Fileupload\\UploadData.txt";

        try {

           Runtime.getRuntime().exec(System.getProperty("user.dir") + "//Fileupload//UploadEx1.exe" );

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
