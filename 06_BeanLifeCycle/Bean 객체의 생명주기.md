# Bean 객체의 생명 주기

Spring의 Bean은 다음과 같은 상황일 때 객체가 생성된다

Singleton인 경우 xml파일을 로딩할 때 객체가 생성된다

→ lazy-init, prototype 인 경우 getBean을 통해서 생성된다 (xml을 불러오기만해서 생성되는게 아니다)

singleton이고 lazy-init 속성이 true일 경우 getBean 메서드를 사용할떄 객체가 생성된다

prototype일 경우 getBean 메서드를 사용할 때 객체가 생성된다

spring의 Bean은 IoC 컨테이너가 종료 때 객체가 소멸된다 .close()

객체가 생성되면 가장 먼저 생성자가 호출된다

init-method : 생성자 호출 이후 자동으로 호출된다

destroy-method: 객체가 소멸될 때 자동으로 호출된다

default-destory-method: destory-method를 설정하지 않은 경우 자동으로 호출된다

메서드가 없을 경우

default-init-method: 아무 일도 발생하지 않는다

default-destroy-method: 아무 일도 발생하지 않는다

init-method: 오류가 발생한다

destroy-method: 오류가 발생한다

Spring에서는 객체가 생성될 때 init-method, destroy-method를 사용하여 호출될 메서드와 소멸될 때 호출될 메서드를 지정할 수 있다