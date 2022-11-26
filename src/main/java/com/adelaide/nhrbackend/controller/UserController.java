package com.adelaide.nhrbackend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
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
