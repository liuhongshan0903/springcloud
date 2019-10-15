package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 *  服务提供者 
 * @author liuhs
 * @EnableConfigServer注解开启配置服务器的功能
 * @EnableEurekaClient 让服务使用Eurake服务器 = @EnableDiscoveryClient
 * 让服务使用eureka服务器，只需添加@EnableDiscoveryClient注解就可以了
 */
@SpringBootApplication
@EnableConfigServer
//@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigServerApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
        System.out.println("Hello World! ConfigServerApplication  服务提供者  启动");
    }
    
}