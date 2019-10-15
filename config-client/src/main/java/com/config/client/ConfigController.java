package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户端 获取配置文件
 * @author liuhs
 *
 */
@RestController
@Configuration
public class ConfigController {
	
	@Value("${port}")
	String port;
	
	@Value("${hostname}")
	String hostname;

	@RequestMapping(value = "/getPort")
	public String hi() {
		System.out.println("=============================getPort=============================");
		return "hostname:"+hostname+"========port:"+port;
	}
}
