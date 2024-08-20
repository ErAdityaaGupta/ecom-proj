package com.fru.ecom_proj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Aditya";
    }
}
