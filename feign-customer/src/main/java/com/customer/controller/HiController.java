package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.service.SchedualServiceHi;
/**
 * 
 * @author liuhs
 * 对外暴露一个”/hi”的API接口，
 * 通过上面定义的Feign客户端SchedualServiceHi来消费服务。
 * 优点是注册和解耦方便
 *
 */
@RestController
public class HiController {
 
    @Autowired
    SchedualServiceHi schedualServiceHi;
    
    @RequestMapping(value = "/getFign")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
