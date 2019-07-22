package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class RibbonServer {
    public static void main(String[] args) {
        SpringApplication.run(RibbonServer.class, args);
    }
    @Bean
    @LoadBalanced //ribbon 负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
