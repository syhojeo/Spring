//default init, destroy
package kr.co.ezenac.beans;

public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
	
	public void default_init() {
		System.out.println("TestBean의 default_init");
	}
	
	public void default_destroy() {
		System.out.println("TestBean2의 default_destroy");
	}
}
