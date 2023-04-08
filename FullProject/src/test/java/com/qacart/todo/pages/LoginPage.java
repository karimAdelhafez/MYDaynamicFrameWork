package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.utls.ConfigUtils;
import com.qacart.todo.utls.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);

    }

    @FindBy(css = "[data-testid=\"email\"]")
   protected   WebElement insertemail;
    @FindBy(css = "[data-testid=\"password\"]")
   protected WebElement insertpassword;

    @FindBy(css = "[data-testid=\"submit\"]")
    protected WebElement submit;
    public LoginPage load(){
        driver.get(ConfigUtils.getInstance().BaseUrl());
        return this;
    }

public TodoPage login(String email , String password){
    insertemail.sendKeys(email);
    insertpassword.sendKeys(password);
    submit.click();
    return new TodoPage(driver);



}

}
