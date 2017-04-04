package com.quisier.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gustavosousa on 4/2/17.
 */
@RequestMapping("/api")
@RestController
public class HelloWorldController {

    @PreAuthorize("hasRole('STUDENT')")
    @RequestMapping("/student")
    public String hello(){
        return "Hello World!";
    }


    @PreAuthorize("hasRole('TEACHER')")
    @RequestMapping("/teacher")
    public String teacher(){
        return "Hello World Teather!";
    }

}
