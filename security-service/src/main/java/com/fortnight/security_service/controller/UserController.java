package com.fortnight.security_service.controller;

import com.fortnight.security_service.model.User;
import com.fortnight.security_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
//@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET) 
    public String message() {
        return "Home...";
    }

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/get_user_info/{uid}", method = RequestMethod.GET) 
    public User getUserInfo() {
        User user = new User();
        return user;
    }
}
