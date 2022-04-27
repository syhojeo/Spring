package kr.co.ezenac.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.ezenac.beans.DataBean1;
import kr.co.ezenac.beans.DataBean2;
import kr.co.ezenac.beans.DataBean3;
import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	
	@Bean
	//생성자를 이용한 DI
	public TestBean1 java1() {
		return new TestBean1(200, "문자열2", data_bean1());
	}
	/* 위와 동일
 	<bean id="xml1" class="kr.co.ezenac.beans.TestBean1" lazy-init="true">
		<constructor-arg value="200" type="int" index="0"></constructor-arg>
		<constructor-arg value='문자열2' index="1"></constructor-arg>
		<constructor-arg ref="data_bean1" index="2"></constructor-arg>
	</bean>
	 */
	
	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}
	
	/* 위와 동일
	<bean id="data_bean1" class="kr.co.ezenac.beans.DataBean1"></bean>
	*/
	
	
	@Bean
	//Setter를 이용한 DI
	public TestBean1 java2() {
		TestBean1 obj = new TestBean1();
		obj.setData1(400);
		obj.setData2("문자열4");
		obj.setData3(new DataBean1());
		return obj;
	}
	
	/* 위와 동일 
	 <bean id="xml2" class="kr.co.ezenac.beans.TestBean1" lazy-init="true">
		<property name="data1" value="200"></property>
		<property name="data2" value="문자열2"></property>
		<property name="data3" ref="data_bean1"></property>
	 </bean>
	 */
	
	//byName을 이용한 자동 주입
	@Bean
	public DataBean2 data1() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public TestBean2 java3() {
		
		return new TestBean2();
	}
	
	/* 위와 동일 
	<bean id="data1" class="kr.co.ezenac.beans.DataBean2"></bean>
	<bean id="data2" class="kr.co.ezenac.beans.DataBean2"></bean>
	
	<bean id="xml3" class="kr.co.ezenac.beans.TestBean2" lazy-init="true" autowire="byName"></bean>
	*/
	

	//ByType을 통한 자동주입
	@Bean(autowire=Autowire.BY_TYPE)
	public TestBean3 java4() {
		
		return new TestBean3();
	}
	
	//자동으로 타입을 찾아서 읽는다
	@Bean
	public DataBean3 data600() {
		return new DataBean3();
	}

	/*
	<bean class="kr.co.ezenac.beans.DataBean3"></bean>
	<bean id="xml4" class="kr.co.ezenac.beans.TestBean3" lazy-init="true" autowire="byType"></bean>
	*/
}
