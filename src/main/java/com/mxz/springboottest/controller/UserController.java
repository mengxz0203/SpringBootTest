package com.mxz.springboottest.controller;

import com.mxz.springboottest.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping("/all")
    public List<User> getAllUser() {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setUserName("mxz");
        user.setId(1);
        user.setAge(25);
        userList.add(user);
        return userList;
    }
}
