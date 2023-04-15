package com.qacart.todo.api;

import com.qacart.todo.object.User;
import com.qacart.todo.utls.UserUtils;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RegisterApi {
    private static List<Cookie> restAssuredCookies;
    private static String accessToken;
    private static String userId;
    private static String firstName;
    private static String email;
    private static String password;


    public String getToken(){
    return this.accessToken;
    }
    public List<Cookie> getCookies(){

        return restAssuredCookies;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }


    public  void register(){
        User user =UserUtils.generateRandomUser();
        Response response =
             given()
                .baseUri("https://todo.qacart.com/")
                .header("Content-Type","application/json")
                .body(user)
                .log()
                .all()
             .when()
                .post("/api/v1/users/register")
             .then()
                .log().all()
                .extract().response();

        if (response.statusCode()!= 201){
            throw new RuntimeException("some thing is went wrong");
        }
        restAssuredCookies = response.detailedCookies().asList();
         accessToken = response.path("accessToken");
         userId=response.path("userID");
         firstName = response.path("firstName");




    }
}

