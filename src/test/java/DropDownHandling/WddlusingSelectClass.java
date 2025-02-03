package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility;

import java.util.Arrays;
import java.util.List;

public class WddlusingSelectClass {
    public static void main (String args[]){
        System.out.println("start programs");
        String bName ="ch";
        String url ="https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
       WebDriver driver= gu.startUp(bName,url);
        WebElement ele = driver.findElement(By.id("oldSelectMenu"));
        Select sel = new Select(ele);
     WebElement selectedoption = sel.getFirstSelectedOption();
String selectedColor =selectedoption.getText();
if(selectedColor.equals("Red")){
    System.out.println("Red color is selected");
}
     else {
         System.out.println("Red color is not  selected");
     }
     //get all option in dropdown
        List<WebElement> eles = sel.getOptions();
     int numbofcolor = eles.size();
     System.out.println("numbers of color in drop Down:" +numbofcolor);
     //verify all color with expected
        String[] expectedColorArray = {"Red","Blue","Green","Yellow","Purple",
                "Black","White","Voilet","Indigo","Magenta","Aqua"};
        List<String> ActualColor =gu.getAllTextFromList(eles);
        //converting array to list
        List<String > ExpectedColor = Arrays.asList(expectedColorArray);
        if(expectedColorArray.equals(ActualColor)){
            System.out.println("dropdown conttain expected color ");
        }
        else {
            System.out.println("dropdown does not contain expected color");
        }

    }

}
