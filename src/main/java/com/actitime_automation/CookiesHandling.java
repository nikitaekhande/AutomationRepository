package com.actitime_automation;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class CookiesHandling {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("size of the cookies "+cookies.size());
   //print the cookies from browser
        for(Cookie cookie :cookies){
            System.out.println(cookie.getName()+" : "+cookie.getValue());
        }
        //add cookies to the browser
        Cookie cookieobj = new Cookie("myCookies","123455");
        driver.manage().addCookie(cookieobj);
        cookies = driver.manage().getCookies();
        System.out.println("sizeof the cookies "+cookies.size());

       // driver.manage().deleteCookie(cookieobj );




    }
}
