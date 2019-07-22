package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker //声明启用数据监控
@EnableHystrixDashboard //声明启用仪表盘
//http://localhost:8200/actuator/hystrix.stream 监控数据地址
//http://localhost:8200/hystrix  仪表盘地址
public class FeignHysApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignHysApplication.class,args);
    }
}
