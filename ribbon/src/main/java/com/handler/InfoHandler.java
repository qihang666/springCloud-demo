package com.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class InfoHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("info")
    public String info(){
        return   restTemplate.getForEntity("http://provide/info",String.class).getBody();
    }
}
