package kr.co.ezenac.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdvisorClass {
	
	@Before("execution(* method1())")
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	@After("execution(* method())")
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	@Around("execution(* method1())")
	public Object aroundMethod(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("aroundMethod 호출1");
		Object result = pjp.proceed();
		System.out.println("aroundMethod 호출2");
		return result;
	}
	
	@AfterReturning("execution(* method1())")
	public void aferReturningMehod() {
		System.out.println("afterReturning 호출");
	}
	
	@AfterThrowing("execution(* method1())")
	public void afterThrowingMethod() {
		System.out.println("afterThrowing 호출");
	}
}
