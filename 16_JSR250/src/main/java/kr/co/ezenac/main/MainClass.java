package kr.co.ezenac.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;
import kr.co.ezenac.beans.TestBean4;
import kr.co.ezenac.beans.TestBean5;
import kr.co.ezenac.beans.TestBean6;
import kr.co.ezenac.config.BeanConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx.getBean("java1", TestBean1.class);
		
		TestBean2 java2 = ctx.getBean("java2", TestBean2.class);
		
		TestBean3 java3 = ctx.getBean("java3", TestBean3.class);
		System.out.printf("Data1 : %s\n", java3.getData1());
		System.out.printf("Data2 : %s\n", java3.getData2());
		
		TestBean4 java4 = ctx.getBean("java4", TestBean4.class);
		System.out.printf("Data1 : %s\n", java4.getData1());
		System.out.printf("Data2 : %s\n", java4.getData2());
		
		TestBean5 java5 = ctx.getBean("java5", TestBean5.class);
		System.out.printf("Data1 : %s\n", java5.getData1());
		System.out.printf("Data2 : %s\n", java5.getData2());
		

		TestBean6 java6 = ctx.getBean("java6", TestBean6.class);
		System.out.printf("Data1 : %s\n", java6.getData100());
		System.out.printf("Data2 : %s\n", java6.getData200());
		ctx.close();
	}
}
