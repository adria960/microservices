package com.eureka.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaCommonApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaCommonApp.class, args);

    }
}
