package kr.co.ezenac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezenac.beans.TestBean1;

public class MainClass {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		
		TestBean1 obj1 = ctx.getBean("obj1", TestBean1.class);
		
		System.out.printf("obj1.data1 : %s\n", obj1.getData1());
		System.out.printf("obj1.data2 : %s\n", obj1.getData2());
		
		System.out.println("----------------------------------------");
		ctx.close();
	}
}
