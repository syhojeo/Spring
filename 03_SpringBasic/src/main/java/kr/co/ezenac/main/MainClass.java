/*
 * bean 사용방법
 */
package kr.co.ezenac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezenac.beans.HelloWorld;
import kr.co.ezenac.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		//beans.xml 파일을 로딩한다
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		
		// xml에 정의한 bean 객체의 주소값을 가져온다
		//getBean은 object타입을 반환하기 때문에 캐스팅을 해줘야한다
		//getBean("id")
		HelloWorld hello1 = (HelloWorld)ctx.getBean("hello");
		callMethod(hello1);
		
		//캐스팅 없이 두번째 매개변수로 클래스 명을 넣어주면 알맞는 객체가 리턴된다
		HelloWorld hello2 = ctx.getBean("hello", HelloWorld.class);
		callMethod(hello2);
		
		
		ctx.close();
	}
	
	public static void callMethod(HelloWorld helloKo) {
		helloKo.sayHello(); // "Good Morning~~"
	}

}
