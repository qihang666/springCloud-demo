package com.handler;

import com.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoHandler {
    @Value("${server.port}")
    private int port;

    @GetMapping("info")
    public String info(){
        UserInfo u = new UserInfo("name","pass222",port);
        return u.toString();
    }
}
