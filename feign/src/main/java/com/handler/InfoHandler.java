package com.handler;

import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class InfoHandler {

    @Autowired
    private UserService userService;

    @GetMapping("info")
    public String info() {
        return userService.info();
    }
}
