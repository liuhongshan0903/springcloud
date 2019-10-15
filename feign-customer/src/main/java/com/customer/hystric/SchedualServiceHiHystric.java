package com.customer.hystric;

import org.springframework.stereotype.Component;
import com.customer.service.SchedualServiceHi;

/**
 * 熔断统一处理方法
 * @author liuhs
 *
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name +"  FeignCustomer  被熔断了！";
	}

}
