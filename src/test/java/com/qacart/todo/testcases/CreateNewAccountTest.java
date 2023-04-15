package com.qacart.todo.testcases;

import com.qacart.todo.api.RegisterApi;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewAccountPage;
import com.qacart.todo.pages.NewTodoPage;
import com.qacart.todo.utls.UserUtils;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Add Account")

public class CreateNewAccountTest extends BaseTest {

    @Test (description = "Test Create New Account")
    public void fillform (){
        LoginPage loginpage = new LoginPage(getDriver());
        loginpage.load();


        NewAccountPage newaccount = new NewAccountPage(getDriver());
        newaccount.signup("karim","adel","karim.adel42@test.com","12345678","12345678");


       /* RegisterApi registerApi = new RegisterApi();
        registerApi.register();

        NewTodoPage newtodopage = new NewTodoPage(getDriver());
        newtodopage.load();

        injectCookiesToBrowser(registerApi.getCookies());
        newtodopage.load();*/

    }

}
