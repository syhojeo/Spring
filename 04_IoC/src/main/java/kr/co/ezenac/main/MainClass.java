/*
	Bean을 이용한 객체 생성
	
	BeanFactory vs ApplicationContext

	1. 객체생성(생성자 호출) 타이밍 (lazy-loading)
	1.1 BeanFactory는 getBean을 할때 객체가 생성
		1) ClassPathResource 혹은 FileSystemResource 를 통해 xml파일 로딩
		2) 로딩된 xml 객체를 이용하여 BeanFactory 생성
		3) 생성된 BeanFactory를 이용하여 getBean()을 통해 실제 사용할 객체 생성
	
	1.2 ApllicationContext는 ApplicationContext 은 xml파일을 로딩하면서 (new)
		미리객체를 생성해서 가지고 있는다 (eager-loading)
		
		1)	ClassPathXmlApplicationContext 혹은 FileSystemXmlApplicationContext 를 통해
			xml 로딩과 함께 객체 생성
	
	2. 둘다 xml을 패키지 내부가 아닌 외부에 둬도 다른점은 없다
	다만 패키지 내부에 xml이 있는 경우 xml 파일 로딩시 ClassPathResource 를 타입으로 가져야하며
		패키지 외부에 xml이 있는 경우 xml 파일 로딩시 FileSystemResource 을 타입으로 가져야한다
	
 */

package kr.co.ezenac.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.ezenac.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	//BeanFactory - 패키지 내부에 있는 beans.xml 사용
	public static void test1() {
		//xml 파일 로드 (즉시 생성자 호출 x)
		ClassPathResource res = new ClassPathResource("kr/co/ezenac/config/beans.xml");
		//BeanFactory 사용
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		// 생성자 호출(객체 생성)
		TestBean t1 = factory.getBean("t1", TestBean.class);

		System.out.printf("t1 : %s\n", t1);

		// 한번 만들었기 때문에 다시 만들지 않는다
		// 출력시 t1, t2의 주소값이 같다 (즉, 같은 객체란 뜻)
		TestBean t2 = factory.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);

	}
	
	// BeanFactory - 패키지 외부에 있는 beans.xml 사용
	public static void test2() {
		//xml 파일 로드 (즉시 생성자 호출 x)
		FileSystemResource res = new FileSystemResource("beans.xml");
		//BeanFactory 사용
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//외부에 있는 beans.xml 을 참고해도 한번 만든객체
		//즉, 중복되는 객체가 있는 경우 추가로 생성하지 않는다
		//생성자 호출(객체 생성)
		TestBean t1 = factory.getBean("t2", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = factory.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		
	}
	
	/*
	 	ApplicationContext 는 new동시에 생성자가 호출되고
	 	ApplicationContext.close() 를 사용할 수 있다
	 */
	
	
	// ApplicationContext - 패키지 내부에 있는 beans.xml 참조
	public static void test3() {
		//xml파일 로드 (즉시 생성자 호출)
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		System.out.printf("cx : %s\n" ,ctx);
		
		//중복되는 객체는 만들지 않는다
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		ctx.close();
	}
	
	// ApplicationContext - 패키지 외부
	public static void test4() {
		//xml파일 로드 (즉시 생성자 호출)
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		//중복되는 객체는 만들지 않는다
		TestBean t1 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		ctx.close();
	}
}
