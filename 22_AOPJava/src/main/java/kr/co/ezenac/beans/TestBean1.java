package kr.co.ezenac.beans;

import org.springframework.stereotype.Component;

@Component

public class TestBean1 {
	
	public void method1() throws Exception {
		System.out.println("TestBean1의 method1 호출");
		
		//인위적인 에러 일으키기
		//int a1 = 10/0;
	}
}
