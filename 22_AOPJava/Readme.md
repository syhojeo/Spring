## @AspectJ
@AspectJ 어노테이션을 활용해 Advisor 역활을 할 Bean을 설정할 수 있다

다음 두가지를 이용해 각각 xml, .java 에서 자동으로 @AspectJ 어노테이션을 읽어와서 적용한다
<aop:aspectj-autoproxy>
@EnableAspectJAutoProxy


@Before: 관심사 동작 이전에 호출된다

@After: 관심사 동작 이후에 호출된다

@Around: 관심사 동작 이전 이후를 의미한다

@AfterReturning: 예외없이 정상적으로 종료되었을 때 호출된다

@AfterThrowing: 예외가 발생하여 종료되었을 때 호출된다
