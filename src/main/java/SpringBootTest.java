package com.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 表示该类返回json格式
@EnableAutoConfiguration
// 该类装配springboot内置tomcat中
public class SpringBootTest {
    @RequestMapping("/index")
    public String test() {
        return "success";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest.class, args);
    }
}
