package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.service.HelloService;


@RestController
public class HelloControler {
 
    @Autowired
    HelloService helloService;
    
    @RequestMapping(value = "/hi111")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
    
    @RequestMapping(value = "/getPort111")
    public String hiService1(@RequestParam String name){
        return helloService.hiService1(name);
    }
    
 
 
}