package kr.co.ezenac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezenac.beans.TestBean;

public class MainClass {
	
	public static void main(String[] args) {
		//xml 안에 있는 bean 모두를 객체 생성한다 bean이 3개면 각각 1개씩 총 3개 생성
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		
//		TestBean t1 = ctx.getBean("test1", TestBean.class);
//		System.out.printf("t1: %s\n", t1);
//		 
//		//동일 객체는 또 만들지 않는다  (singleton 특성)
//		TestBean t2 = ctx.getBean("test1", TestBean.class);
//		System.out.printf("t2: %s\n", t2);
//		
//		//bean id 가 다르면 새로운 객체를 생성 되어 있다 (xml 로드할때 다른 싱글톤으로 객체 생성한다)
//		TestBean t3 = ctx.getBean("test2", TestBean.class);
//		System.out.printf("t3 : %s\n", t3);
//		
//		TestBean t4 = ctx.getBean("test2", TestBean.class);
//		System.out.printf("t4 : %s\n", t4);
		
		
		
		//주석처리하고 실행시 laze-init에 의해 객체 생성이 되지 않는것을 알 수 있다
		//bean 에서 lazy-init을 true한다면 getBean()을 할때에 객체 생성이 된다
//		TestBean t5 = ctx.getBean("test4", TestBean.class);
//		System.out.printf("t5 : %s\n", t5);
		
		//lazy-init 을 하더라도 중복된 객체에 관해서는 중복 객체 생성하지 않는다
//		TestBean t6 = ctx.getBean("test4", TestBean.class);
//		System.out.printf("t6 : %s\n", t6);
		
		//scope="prototype" 객체를 가져올때마다(getBean) 객체생성
		//id가 중복되어도 가져올때마다(getBean 할때마다) 객체 생성을 한다 (싱글톤 특성을 없앴다)
		TestBean t7 = ctx.getBean("test5", TestBean.class);
		System.out.printf("t7 : %s\n", t7);
		
		TestBean t8 = ctx.getBean("test5", TestBean.class);
		System.out.printf("t8 : %s\n", t8);
	}
}
