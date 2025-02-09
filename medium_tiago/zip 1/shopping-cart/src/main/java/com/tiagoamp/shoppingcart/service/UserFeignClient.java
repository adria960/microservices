package com.tiagoamp.shoppingcart.service;

import com.tiagoamp.shoppingcart.domain.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8082", name = "UserInformationService")
public interface UserFeignClient {

    @GetMapping("/api/user/{id}")
    UserInfo findById(@PathVariable("id") Long id);
}