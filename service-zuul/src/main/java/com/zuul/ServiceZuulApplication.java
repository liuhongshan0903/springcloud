package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 路由网关
 * @author liuhs
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
        System.out.println("Hello World! ZuulProxy 路由网关 负载分发启动！！！");
    }
}

