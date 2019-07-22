package com.terminalmock.test.controllers;

import com.terminalmock.test.entities.entity.User;
import com.terminalmock.test.services.entityServices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/current")
    public User getCurrent(){
        return userService.getCurrentUser();
    }

}
