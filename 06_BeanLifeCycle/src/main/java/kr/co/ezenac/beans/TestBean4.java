package kr.co.ezenac.beans;

public class TestBean4 {
	
	public TestBean4() {
		System.out.println("TestBean4의 생성자");
	}
	
	
	//default-init-method가 없을 경우에는 에러가 발생하지 않지만
	//bean정의하는 사용자 정의 init-method가 없는 경우에는 에러가 발생한다 
	
	
	
	//bean에서 init-method를 사용한다고 속성을 넣었다면
	//default_init_method가 정의되어 있더라도 init-method 메서드가 정의되어 있지 않으면 에러가 발생한다
	public void default_init() {
		System.out.println("TestBean3의 default_init");
	}
	
	public void default_destroy() {
		System.out.println("TestBean3의 default_destroy");
	}
}
