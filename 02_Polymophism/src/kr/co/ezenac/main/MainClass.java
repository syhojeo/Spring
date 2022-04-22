package kr.co.ezenac.main;

import kr.co.ezenac.beans.*;

//다형성을 사용한 방법
public class MainClass {
	
	public static void main(String[] args) {
		//인터페이스를 이용한 다형성 사용
		HelloWorld helloEn = new HelloWorldEn();
		HelloWorld helloKo = new HelloWorldKo();
		
		helloEn.sayHello();
		helloKo.sayHello();
	}
}
