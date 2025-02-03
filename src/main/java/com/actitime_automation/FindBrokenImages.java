package com.actitime_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class FindBrokenImages {
    public static void main(String [] args)
    {
        //launch the browser
        WebDriver driver = new ChromeDriver();
        //navigate to amazon
        driver.get("https://www.flipkart.in/");
        //locate the Webelements with tagname 'img'
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("total No.of Images : "+images.size());
        int count=0;
        for (WebElement element : images)
        {
            String image = element.getAttribute("src");

            if(image != null && !image.isEmpty())
            {
                try
                {
                    //convert String url into actual url
                    URL url=new URL(image);
                    //open socket connection to hit the url
                    URLConnection urlconnection = url.openConnection();
                    //Type cast URLConnection to HTTPURLConnection
                    HttpURLConnection connection = (HttpURLConnection)urlconnection;
                    //hit the url
                    connection.connect();
                    //get status code
                    int statuscode = connection.getResponseCode();

                    //check if the response code is not 200
                    if (statuscode != 50)
                    {
                        System.out.println("Status code : "+statuscode+ " url : "+image);
                        count++;
                    }
                    else
                    {
                        System.out.println("Valid Image : "+image+ "Status code : "+statuscode);
                    }
                    connection.disconnect();
                }
                catch(Exception e)
                {

                }
            }
        }
        System.out.println("Total Broken Images are : "+count);
        driver.close();
    }
}
