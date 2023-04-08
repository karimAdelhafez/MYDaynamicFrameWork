package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.utls.ConfigUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodoPage extends BasePage {
    public TodoPage (WebDriver driver){
        super(driver);
    }



    @FindBy(css = "[data-testid=\"welcome\"]")
    protected WebElement WelcomeMessage;

    @FindBy(css = "[data-testid=\"delete\"]")
    protected WebElement delete;
    @FindBy(css = "[data-testid=\"no-todos\"]")
    protected WebElement notodomessage;

public void DeleteTodo(){
        delete.click();
}
public boolean NoTodoMessage(){
        return notodomessage.isDisplayed();

}
    public boolean isWelcomeMessageDisplayed(){

    return WelcomeMessage.isDisplayed();
    }
}
