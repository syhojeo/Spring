package kr.co.ezenac.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{
	
	//init-method 호출 전 (생성한 객체를 빈저장소에 등록하기 직전에 사용)
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("before");
		System.out.println("beanName=" + beanName);
		
		switch(beanName) {
		case "t1":
			System.out.println("id가 t1인 bean 객체 생성");
			break;
		case "t2":
			System.out.println("id가 t2인 bean 객체 생성");
			break;
		}
		return bean;
	}
	
	//init-method 호출 후 (생성한 객체를 빈 저장소에 등록한 직후에 사용)
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("after");
		System.out.println("beanName=" + beanName);
		return bean;
	}
}
