package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewAccountPage;
import org.testng.annotations.Test;

public class CreateNewAccountTest extends BaseTest {

    @Test
    public void fillform (){
        LoginPage loginpage = new LoginPage(driver);
        loginpage.load();
        NewAccountPage newaccount = new NewAccountPage(driver);
        newaccount.signup("karim","adel","karim.adel30@test.com","12345678","12345678");

    }

}
