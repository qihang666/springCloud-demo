package com.service.impl;

import com.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceError implements UserService {
    @Override
    public String info() {
        return "服务器维护中";
    }
}
