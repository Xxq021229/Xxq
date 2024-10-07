package com.helloworld.controller;

import com.helloworld.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @PostMapping("/login")
    public String postMethod(@RequestBody User user) {
        if ( !(user.getUserName() != null && user.getUserName().equals("test"))) {
            return "error";
        }

        if (!(user.getPassword() != null && user.getPassword().equals("123456") )) {
            return "error";
        }
        return "Hello World";
    }
}
