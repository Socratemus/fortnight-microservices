package com.fortnight.security_service.controller;

import com.fortnight.security_service.dto.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;
import java.util.Set;

@RestController
@RequestMapping("/auth/v1")
public class AuthController {


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    String login(@RequestParam(value = "username", required = true) String  username,
                 @RequestParam( value = "password", required = true) String password) {


        return "Login page goes in here...";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    User register(@Valid @RequestBody User user) {

//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//
//        Validator validator = factory.getValidator();
//
//        Set<ConstraintViolation<User>> constraintViolations = validator.validate( user );

//        if(! constraintViolations.isEmpty() ) {
//            Exception e = new ValidationException();
//            e.printStackTrace();
//            throw new ValidationException("Invalid payload provided.").;
//        }

        return user;//"Login page goes in here...";
    }

}
