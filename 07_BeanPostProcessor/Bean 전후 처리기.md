# BeanPostProcessor

Bean 객체를 정의할 때 init-method 속성을 설정하면 객체가 생성될 때 자동으로 호출될 메서드를 지정할 수 있다.

이 때 BeanPostProcessor 인터페이스를 구현한 클래스를 정의하면 Bean객체를 생성할 때 init 메서드 호출을 가로채 다른 메서드를 호출할 수 있다

(객체 생성시 init-method가 아닌 다른 메서드 사용)

### postProcessBeforeInitialization

init-method에 지정된 메서드가 호출되기 전에 호출된다

### postProcessAfterInitialization

init-method에 지정된 메서드가 호출된 후에 호출된다

Spring에서는 객체가 생성될 때 init-method로 지정된 메서드가 호출되기 전, 후에 다른 메서드를 호출 할 수 있도록 지원하고 있다