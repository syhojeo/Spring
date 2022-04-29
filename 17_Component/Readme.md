# Component

## @Component

Bean Configuration 파일에 Bean을 등록하지 않아도 메서드를 @Component로 설정하면 자동으로 등록된다

Component 또한 기본적으로 싱글톤 특성을 가진다

## @Component vs @Bean

이 둘의 사용처는 외부 라이브러리를 사용할지, 내부 라이브러리를 사용할지에 따라 달라진다 

@Component의 경우 이를 붙이려면 접근 가능한 (소스코드를 직접 수정할 수 있는) 라이브러리에만 사용 가능하기 때문에
내부 라이브러리에 사용되며

@Bean은 @Component가 하지 못하는 외부 라이브러리를 가져올떄 사용된다
