package com.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * 服务链路追踪
 * @author liuhs
 *
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class, args);
        System.out.println("ServerZipkinApplication 启动了！！！");
    }
        
}
