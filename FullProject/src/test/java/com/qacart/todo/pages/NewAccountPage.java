package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage extends BasePage {


    public NewAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[data-testid=\"signup\"]" )
    protected WebElement signup;

    @FindBy(css = "[data-testid=\"first-name\"]")
    protected WebElement firstname;
    @FindBy(css = "[data-testid=\"last-name\"]")
    protected WebElement lastname ;
    @FindBy(css = "[data-testid=\"email\"]")
    protected WebElement email;
    @FindBy(css = "[data-testid=\"password\"]")
    protected WebElement password;
    @FindBy(css = "[data-testid=\"confirm-password\"]")
    protected WebElement confirmpassword;
    @FindBy(css = "[data-testid=\"submit\"]")
    protected WebElement submit;



    public void signup(String fname , String lname , String mail , String Password , String cpassword ){
        signup.click();
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(mail);
        password.sendKeys(Password);
        confirmpassword.sendKeys(cpassword);
        submit.click();
    }
}
