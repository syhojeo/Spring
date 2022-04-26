package kr.co.ezenac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


import kr.co.ezenac.beans.TestBean1;


@Configuration
public class BeanConfigClass {
	
	//init, destroy method 설정 방법
	@Bean(initMethod="init", destroyMethod="destroy")
	@Lazy
	public TestBean1 java1() {
		return new TestBean1();
	}
}
