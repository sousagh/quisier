package com.quisier.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gustavosousa on 4/2/17.
 */
@RequestMapping("/api")
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

}
