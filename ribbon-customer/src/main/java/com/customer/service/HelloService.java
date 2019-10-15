package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
 
    @Autowired
    RestTemplate restTemplate;
 

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-LIUHS/service",String.class);
    }
    

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService1(String name) {
    	System.out.println("name:"+name);
        return restTemplate.getForObject("http://SERVICE-LIUHS/getPort",String.class);
     
    }

    
    /**
     * 指定熔断的方法
     * @param name
     * @return
     */
    public String hiError(String name) {
        return "hi, "+name+" , sorry , error!  应用无法访问，被熔断了 ！";
    }

}
