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
    protected ThreadLocal<WebDriver> driver= new ThreadLocal<>();

    public void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }

    public WebDriver  getDriver() {
        return this.driver.get();
    }

    @BeforeMethod
    public void Setup(){

        WebDriver driver = new DriverFactory().InitializeDriver();
        setDriver(driver);
    }
   @AfterMethod
    public void quite(){

        getDriver().quit();
    }
    public void injectCookiesToBrowser(List<Cookie> restAssuredCookies){
        List<org.openqa.selenium.Cookie> seleniumCookies = CookieUtils.convertRestAssuredCookiesToSeleniumCookies(restAssuredCookies);
   for (org.openqa.selenium.Cookie cookie : seleniumCookies){
       getDriver().manage().addCookie(cookie);
   }
    }

}
