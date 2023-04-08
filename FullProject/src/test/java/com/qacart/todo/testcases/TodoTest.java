package com.qacart.todo.testcases;

import com.qacart.todo.Factory.DriverFactory;
import com.qacart.todo.api.RegisterApi;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewTodoPage;
import com.qacart.todo.pages.TodoPage;
import com.qacart.todo.utls.ConfigUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TodoTest extends BaseTest {
    //private WebDriver driver;
    @Test
    public void AddTodo() {
        RegisterApi registerApi = new RegisterApi();
        registerApi.register();

        // Logi

//LoginPage loginPage = new LoginPage(driver);
//loginPage.load();

        NewTodoPage newtodopage = new NewTodoPage(driver);
        newtodopage.load();
        injectCookiesToBrowser(registerApi.getCookies());

        newtodopage.load().CreateTodo("newtest");



        //Create new Todo

        String ActualResult = newtodopage.GetTodoText();
        Assert.assertEquals(ActualResult, "newtest");
       // Assert.assertTrue(w)  ;

        //Delete Todo
        TodoPage todoPage = new TodoPage(driver);
        todoPage.DeleteTodo();
        boolean NoTodos = todoPage.NoTodoMessage();
        Assert.assertTrue(NoTodos);
    }
}



