package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility;

import java.util.List;

public class W_Multi_Select_Example {
    public static void main(String args[]) {
        String bName = "ch";
        String url = "https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        WebElement ddele = driver.findElement(By.id("cars"));
       // ddele.click();
        gu.scrollByJS(driver, ddele);

        Select sel = new Select(ddele);

        sel.selectByVisibleText("Volvo");
        sel.selectByValue("opel");
        sel.selectByIndex(3);

        List<WebElement> eles = sel.getOptions();
        int numbofcar = eles.size();
        System.out.println("numbers of car in drop Down:" +numbofcar);

        List<WebElement> allselectedcar = sel.getAllSelectedOptions();
       // System.out.println("total selected car:" + allselectedcar);

        
        List<String> allselectedcar1 = gu.getAllTextFromList(eles);
        System.out.println("all selected car :" + allselectedcar1);
        if (allselectedcar1.isEmpty()) {
            System.out.println("No Cars are selected.");
        } else {
            System.out.println("Cars are selected.");

        }
    }
}
