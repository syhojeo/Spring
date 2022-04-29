package kr.co.ezenac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.ezenac.beans.DataBean1;
import kr.co.ezenac.beans.DataBean3;
import kr.co.ezenac.beans.DataBean4;
import kr.co.ezenac.beans.DataBean5;
import kr.co.ezenac.beans.TestBean3;

@Configuration
@ComponentScan(basePackages="kr.co.ezenac.beans")
public class BeanConfigClass {
	//@Resource(name="obj4")를 하기 위해 Bean에 따로 등록이 필요하다
	@Bean
	public DataBean3 obj4() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean3 obj5() {
		return new DataBean3();
	}
	
	@Bean
	public TestBean3 java2() {
		TestBean3 t2 = new TestBean3(200, "문자열2", new DataBean4(), new DataBean5()); 
		return t2;
	}
}
