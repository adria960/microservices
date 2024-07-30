package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConsumerControllerClient controllerClient;

    @GetMapping
    public String getEmployee() throws IOException {
        controllerClient.getEmployee();
        return "OK";
    }
}
