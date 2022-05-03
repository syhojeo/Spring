package kr.co.ezenac.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod 호출1");
		
		//pjp.preceed() 전후로 메서드가 호출된 후 동작할 전후가 나뉜다
		Object obj = pjp.proceed(); // aspect가 적용될 대상 객체 호출 (method1)
		
		System.out.println("aroundMethod 호출2");
		return obj;
	}
	
	public void afterRetruningMethod() {
		System.out.println("afterReturnMethod 호출");
	}
	
	public void afterThrowingMethod(Throwable e1) {
		System.out.println("afterThrowingMethod 호출");
		System.out.println(e1);
	}
	
}
