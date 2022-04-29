package kr.co.ezenac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans2.TestBean3;
import kr.co.ezenac.beans2.TestBean4;
import kr.co.ezenac.beans3.TestBean5;

@Configuration
/*  
 	xml 설정을 java 코드로 구현
	<context:component-scan base-package="kr.co.ezenac.beans2"></context:component-scan>
	<context:component-scan base-package="kr.co.ezenac.beans3"></context:component-scan>
 */
@ComponentScan(basePackages="kr.co.ezenac.beans2")
@ComponentScan(basePackages="kr.co.ezenac.beans3")
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	
	@Bean
	public TestBean2 java3() {
		return new TestBean2();
	}
	
	@Bean
	public TestBean4 java100() {
		return new TestBean4();
	}
	
	@Bean
	public TestBean4 java200() {
		return new TestBean4();
	}
	
	@Bean
	public TestBean5 java500() {
		return new TestBean5();
	}
}
