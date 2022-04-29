package kr.co.ezenac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.ezenac.beans.DataBean1;
import kr.co.ezenac.beans.DataBean2;
import kr.co.ezenac.beans.DataBean3;
import kr.co.ezenac.beans.DataBean4;
import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 obj4() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 obj5() {
		return new DataBean2();
	}
	
//	@Bean
//	public TestBean2 java2() {
//		return new TestBean2();
//	}
	
	@Bean
	public DataBean3 data_bean3() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean4 data_bean4() {
		return new DataBean4();
	}
}
