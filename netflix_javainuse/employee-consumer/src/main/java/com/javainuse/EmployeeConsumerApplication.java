package com.javainuse;

import com.javainuse.controller.ConsumerControllerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
//public class EmployeeConsumerApplication implements ApplicationRunner {
    public class EmployeeConsumerApplication implements CommandLineRunner {
    @Autowired
    private ConsumerControllerClient controllerClient;

    public static void main(String[] args) throws IOException {
        SpringApplication.run(EmployeeConsumerApplication.class, args);

    }

//    @Override
//    public void run(ApplicationArguments arg0) throws Exception {
//        System.out.println("Hello World from Application Runner");
//        controllerClient.getEmployee();
//    }
    //or method from CommandLineRunner
    @Override
    public void run(String... arg0) throws Exception {
        System.out.println("Hello world from Command Line Runner");
        controllerClient.getEmployee();
    }

}
