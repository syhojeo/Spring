/*
 	init-method, destroy-method
 */
package kr.co.ezenac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;
import kr.co.ezenac.beans.TestBean4;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
//		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
//		System.out.printf("t1 : %s\n", t1);

		
//		TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
//		System.out.printf("t2 : %s\n", t2);
		
		
//		TestBean3 t3 = ctx.getBean("t3", TestBean3.class);
//		System.out.printf("t3 : %s\n", t3);
		
		TestBean4 t4 = ctx.getBean("t4", TestBean4.class);
		System.out.printf("t4 : %s\n", t4);
		
		//소멸하며 destroy 메서드 실행
		//ctx.close();
	}

}
