package com.codewater.controller.controller;

import com.codewater.controller.other_pojo.CodeWaterResult;
import com.codewater.controller.remote.UserServiceRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserServiceRemote userServiceRemote;

    @RequestMapping("/login")
    public CodeWaterResult login(String email, String password){
        return userServiceRemote.login(email, password);
    }
}
