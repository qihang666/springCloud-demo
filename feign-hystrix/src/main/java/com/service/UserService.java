package com.service;

import com.service.impl.UserServiceError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provide",fallback=UserServiceError.class)
public interface UserService {
    @GetMapping("info")
    public String info();
}
