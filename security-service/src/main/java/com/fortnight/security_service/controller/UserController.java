package com.fortnight.security_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import domain.User;

@RestController
//@RequestMapping("/v1/user")
public class UserController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET) 
    public String message() {
        return "Home...";
    }
    
    @RequestMapping(value = "/get_user_info/{uid}", method = RequestMethod.GET) 
    public User getUserInfo() {
        User user = new User();
        
        return user;
    }
}
