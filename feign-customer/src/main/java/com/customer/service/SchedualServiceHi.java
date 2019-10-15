package com.customer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.customer.hystric.SchedualServiceHiHystric;

/**
 *  @author liuhs
 *	通过@ FeignClient（“服务名”），来指定调用哪个服务。
 *  通过返回参数来返回数据
 */
@FeignClient(value = "service-liuhs"  ,fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	
    @RequestMapping(value = "/service")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
