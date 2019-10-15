package com.eureka.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 配置文件 注册 中心 
 * 作用是用Eureka注册服务
 * @author liuhs
 * 它没有后端缓存，每一个实例注册之后需要向注册中心发送心跳（因此可以在内存中完成），
 * 在默认情况下erureka server也是一个eureka client ,必须要指定一个 server。
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaConfigServer {

	public static void main(String[] args){
		SpringApplication.run(EurekaConfigServer.class, args);
		System.out.println("Hello World! 配置文件 注册 中心 启动 !!");
	}

}
