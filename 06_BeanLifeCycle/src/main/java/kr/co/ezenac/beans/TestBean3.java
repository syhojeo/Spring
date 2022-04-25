package kr.co.ezenac.beans;

public class TestBean3 {

	public TestBean3() {
		System.out.println("TestBean3의 생성자");
	}
	
	public void default_init() {
		System.out.println("TestBean3의 default_init");
	}
	
	public void default_destroy() {
		System.out.println("TestBean3의 default_destroy");
	}
	
	//bean에 선언되는 메서드가 beans에서 선언하는 default 메서드보다 더 우선순위가 높다 
	public void bean3_init() {
		System.out.println("TestBean3 init메서드");
	}
	
	public void bean3_destroy() {
		System.out.println("TestBean3 destroy메서드");
	}
}
