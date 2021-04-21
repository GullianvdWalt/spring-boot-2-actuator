package com.gvdw.springbootactuator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Gullian Van Der Walt at 06:52 on Apr, 2021
 */
@RestController
@RequestMapping("/spring-boot-actuator")
public class IndexController {

    @GetMapping("/test")
    public String getTestEndPoint(){
        return "Welcome to Spring boot 2 Actuator example";
    }

}
