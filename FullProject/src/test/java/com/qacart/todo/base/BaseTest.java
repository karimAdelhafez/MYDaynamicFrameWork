package com.qacart.todo.base;

import com.qacart.todo.Factory.DriverFactory;
import com.qacart.todo.utls.CookieUtils;
import io.restassured.http.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void Setup(){

        driver = new DriverFactory().InitializeDriver();
    }
   @AfterMethod
    public void quite(){

        driver.quit();
    }
    public void injectCookiesToBrowser(List<Cookie> restAssuredCookies){
        List<org.openqa.selenium.Cookie> seleniumCookies = CookieUtils.convertRestAssuredCookiesToSeleniumCookies(restAssuredCookies);
   for (org.openqa.selenium.Cookie cookie : seleniumCookies){
       driver.manage().addCookie(cookie);
   }
    }

}
