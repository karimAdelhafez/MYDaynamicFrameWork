package com.qacart.todo.testcases;

import com.qacart.todo.api.RegisterApi;
import com.qacart.todo.object.User;
import com.qacart.todo.utls.ConfigUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.meta.When;

import static io.restassured.RestAssured.given;

public class Dummy {
    public static void main(String[] args) {

        RegisterApi registerApi = new RegisterApi();
        registerApi.register();
    }
}
