package kr.co.ezenac.main;

import kr.co.ezenac.beans.*;

//다형성을 사용하지 않은 방법
public class MainClass {
	
	public static void main(String[] args) {
		HelloWorldKo hello1 = new HelloWorldKo();
		HelloWorldEn hello2 = new HelloWorldEn();
		// HelloKo
		callMethod1(hello1);
		// HelloEn
		callMethod2(hello2);
	}
	
	//같은 동작을 시행하지만 매개변수 타입에 따라서 타입에러가 발생한다
	//두가지 타입에 대한 메소드를 작성하던지
	//다형성을 이용하여 극복해야한다
	public static void callMethod1(HelloWorldKo helloKo) {
		helloKo.sayHello(); // "Good Morning~~"
	}
	
	public static void callMethod2(HelloWorldEn helloEn) {
		helloEn.sayHello();
	}
}
