package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.utls.ConfigUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTodoPage extends BasePage {
    public NewTodoPage (WebDriver driver){
        super(driver);

    }

    @FindBy(css = "[data-testid=\"add\"]")
    protected WebElement Add;
    @FindBy(css = "[data-testid=\"new-todo\"]")
    protected WebElement newtodo;
    @FindBy(css = "[data-testid=\"submit-newTask\"]")
    protected WebElement Submit;
    @FindBy(css = "[data-testid=\"todo-text\"]")
    protected WebElement todotext;
    public NewTodoPage load(){
        driver.get(ConfigUtils.getInstance().BaseUrl() + "todo" );
        return this;
    }
    public TodoPage CreateTodo(String todoname){

        Add.click();
        newtodo.sendKeys(todoname);
        Submit.click();
        return new TodoPage(driver);

    }

    public String GetTodoText(){
        return todotext.getText();
    }




}
