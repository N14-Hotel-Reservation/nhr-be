package com.adelaide.nhrbackend.controller;

import com.adelaide.nhrbackend.entity.User;
import com.adelaide.nhrbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getuser/${username}")
    public User getUserByName(@PathVariable String username){
        return userService.getByUsername(username);
    }

    @PostMapping("/create")
    public String create(){
        return "User created";
    }

    @PutMapping("/update")
    public String update(){
        return "User updated";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "User deleted";
    }


}
