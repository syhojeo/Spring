package kr.co.ezenac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezenac.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		TestBean obj1 = new TestBean();
		obj1.setData1(100);
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		
		System.out.printf("t1.data1 : %d\n", t1.getData1());
		System.out.printf("t1.data1 : %f\n", t1.getData2());
		System.out.printf("t1.data1 : %s\n", t1.isData3());
		System.out.printf("t1.data1 : %s\n", t1.getData4());
		System.out.printf("t1.data1 : %s\n", t1.getData5());
		System.out.printf("t1.data1 : %s\n", t1.getData6());
		
		
		
		ctx.close();
	}
}
