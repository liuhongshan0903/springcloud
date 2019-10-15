package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者
 * 服务配置（全局配置中心）
 * @author liuhs
 *通过注解@EnableEurekaClient 表明自己是一个eurekaclient.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AppClient {

	public static void main(String[] args) {
		SpringApplication.run(AppClient.class, args);
		System.out.println("Hello World! 服务提供者1  启动");
	}



}