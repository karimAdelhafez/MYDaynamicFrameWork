package com.qacart.todo.testcases;

import com.qacart.todo.Factory.DriverFactory;
import com.qacart.todo.api.RegisterApi;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.TodoPage;
import com.qacart.todo.utls.ConfigUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class LoginTest extends BaseTest {
//private WebDriver driver;
    @Feature("Authentication")
    @Test(description = "Login Test")
    public void ShouldBeAbleToLoginWthEmailAndPassword(){


    LoginPage loginPage = new LoginPage(getDriver());
        boolean isWelcomeMessageDisplayed=
                loginPage
                    .load()
                    .login(ConfigUtils.getInstance().getEmail(), ConfigUtils.getInstance().getPassword())
                        .isWelcomeMessageDisplayed();
        Assert.assertTrue(isWelcomeMessageDisplayed);


    }
}
