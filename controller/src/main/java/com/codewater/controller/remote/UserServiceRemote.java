package com.codewater.controller.remote;

import com.codewater.controller.other_pojo.CodeWaterResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="user-service-provider")
public interface UserServiceRemote {
    @RequestMapping("/login")
    CodeWaterResult login(@RequestParam("email")String email,@RequestParam("password") String password);
}
