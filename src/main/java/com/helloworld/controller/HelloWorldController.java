package com.helloworld.controller;

import com.helloworld.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/login")
    public String login(User user) {

        System.out.println(user.getUserName() + " " + user.getPassword());
        if ( !(user.getUserName() != null && user.getUserName().equals("test"))) {
            return "error";
        }

        if (!(user.getPassword() != null && user.getPassword().equals("123456") )) {
            return "error";
        }
        return "Hello World";
    }
}
