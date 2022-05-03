package kr.co.ezenac.beans;

public class TestBean {
	
	public int method1() {
		System.out.println("method1 호출");
		
		//에러 발생시 어떻게 반응하는지 확인 
		//(after-throwing, after 제외하고는 동작하지 않는다)
//		int a1 = 10 / 0;
		
		return 100;
	}
}
