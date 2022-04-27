package kr.co.ezenac.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;
import kr.co.ezenac.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		
		TestBean1 xml1 = ctx1.getBean("xml1", TestBean1.class);
		System.out.printf(" xml1의 Data\n Data1: %d\n Data2: %s\n Data3: %s\n", xml1.getData1(), xml1.getData2(), xml1.getData3());
		
		System.out.println("------------------------------------------------------------");
		
		TestBean1 xml2 = ctx1.getBean("xml2", TestBean1.class);
		System.out.printf(" xml2의 Data\n Data1: %d\n Data2: %s\n Data3: %s\n", xml2.getData1(), xml2.getData2(), xml2.getData3());
		
		
		System.out.println("------------------------------------------------------------");
		
		TestBean2 xml3 = ctx1.getBean("xml3", TestBean2.class);
		System.out.printf(" xml3의 Data\n Data1: %s\n Data2: %s\n", xml3.getData1(), xml3.getData2());
		
		
		System.out.println("------------------------------------------------------------");
		
		TestBean3 xml4 = ctx1.getBean("xml4", TestBean3.class);
		System.out.printf(" xml4의 Data\n Data1: %s\n Data2: %s\n", xml4.getData1(), xml4.getData2());
		
		System.out.println("------------------------------------------------------------");
		
		ctx1.close();
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
		System.out.printf("Data1 : %d\n", java1.getData1());
		System.out.printf("Data2 : %s\n", java1.getData2());
		System.out.printf("Data3 : %s\n", java1.getData3());
		
		System.out.println("------------------------------------------------------------");
		
		TestBean1 java2 = ctx2.getBean("java2", TestBean1.class);
		System.out.printf("Data1 : %d\n", java2.getData1());
		System.out.printf("Data2 : %s\n", java2.getData2());
		System.out.printf("Data3 : %s\n", java2.getData3());
		
		System.out.println("------------------------------------------------------------");
		
		TestBean2 java3 = ctx2.getBean("java3", TestBean2.class);
		System.out.printf("Data1 : %s\n", java3.getData1());
		System.out.printf("Data2 : %s\n", java3.getData2());
		
		System.out.println("------------------------------------------------------------");
		
		TestBean3 java4 = ctx2.getBean("java4", TestBean3.class);
		System.out.printf("Data1 : %s\n", java4.getData1());
		System.out.printf("Data2 : %s\n", java4.getData2());
		
		System.out.println("------------------------------------------------------------");
		
		ctx2.close();
	}
}
