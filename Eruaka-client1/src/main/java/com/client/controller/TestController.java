package com.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${server.port}")
    String port;
	
	@RequestMapping("/service")
	public String service() {
		System.out.println(" client2  正在提供服务  访问端口号："+port);
		return " client2  正在提供服务  访问端口号："+port;
	}
	
	 @RequestMapping("/getPort")
	 public String home(@RequestParam String name) {
	       return "hi "+name+",i am from port:"+port;
	 }
	 

}
