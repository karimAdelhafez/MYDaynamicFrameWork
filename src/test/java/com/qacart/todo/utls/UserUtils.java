package com.qacart.todo.utls;

import com.github.javafaker.Faker;
import com.qacart.todo.object.User;

public class UserUtils {
    public static User generateRandomUser(){
        String firstName= new Faker().name().firstName();
        String lastName = new Faker().name().lastName();
        String email = new Faker().internet().emailAddress();
        String passWord= new Faker().internet().password();
        User user = new User(firstName,lastName,email,passWord);
        return user;

    }
}