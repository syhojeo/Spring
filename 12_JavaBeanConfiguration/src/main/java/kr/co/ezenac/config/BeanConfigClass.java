package kr.co.ezenac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;
import kr.co.ezenac.beans.TestBean4;

@Configuration
public class BeanConfigClass {
	
	@Bean
	//bean을 했기 때문에 메서드명이 Bean의 이름이 된다
	//일반적으로 싱글톤 특성을 가지며 로드 해올떄 객체가 생성된다
	//xmlApplicationContext와 동일하다
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		
		return t1;
	}
	
	@Bean(name="java600")
	//name 을 통해 Bean 이름을 변경할 수 있다
	public TestBean1 java500() {
		TestBean1 t1 = new TestBean1();
		
		return t1;
	}
	
	@Bean
	@Lazy
	// @Lazy를 통해 Lazy-load (지연 로드) 특성을 가진다
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2();
		
		return t2;
	}
	
	@Bean
	@Scope("prototype")
	// prototype 설정
	public TestBean3 java3() {
		TestBean3 t3 = new TestBean3();
		
		return t3;
	}
	
	@Bean
	@Primary
	//Primary 설정
	public TestBean4 java4() {
		TestBean4 t4 = new TestBean4();
		
		return t4;
	}
}
