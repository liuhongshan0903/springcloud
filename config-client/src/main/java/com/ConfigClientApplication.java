package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 客户端 获取配置文件
 * @author liuhs
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
        System.out.println("Hello World! ConfigServerApplication  配置中心 客户端  启动");
    }
    

}
 
