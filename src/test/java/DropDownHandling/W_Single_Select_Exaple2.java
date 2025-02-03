package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility;

public class W_Single_Select_Exaple2 {
    public static  void main(String args[]){
        String bName = "ch";
        String url = "https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        //create object of select class
        Select sel = new Select(element);
        //to select data in dropdown
        sel.selectByVisibleText("Aqua");
        sel.selectByValue("10");
        sel.selectByIndex(10);
        //to get single selected element in dd
        WebElement selectedcolor = sel.getFirstSelectedOption();
        String selectedcolorele =selectedcolor.getText();
        System.out.println("slected color is: " +selectedcolorele);

    }
}
