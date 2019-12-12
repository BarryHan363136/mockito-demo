package com.barry.mockito.controller;

import com.barry.mockito.entity.User;
import com.barry.mockito.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/find")
    public List<User> getUsers(){
        return userService.findUsers();
    }

    @PostMapping("/add")
    public Integer add(@RequestBody User user){
        return userService.save(user);
    }


}
