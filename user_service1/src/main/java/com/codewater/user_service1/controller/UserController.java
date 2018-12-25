package com.codewater.user_service1.controller;

import com.codewater.user_service1.other_pojo.CodeWaterResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/login")
    public CodeWaterResult login(@RequestParam("email") String email, @RequestParam("password") String password) {
        return new CodeWaterResult(200, "login ok");
    }
}

