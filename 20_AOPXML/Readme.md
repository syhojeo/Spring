# AOP

- Aspect Oriented Programming : 관점 지향 프로그래밍

- 하나의 프로그램을 관점(혹은 관심사)라는 논리적 단위로 분리하여 관리하는 개념
- 로깅, 감사, 선언적 트랜젝션, 보안, 캐싱 등 다양한 곳에서 사용되고 있다
- 여기에서는 메서드 호출을 관심사로 설정하여 AOP 에 관한 실습을 진행한다
- 관심사를 통해 Spring Framework가 어떤 메서드가 호출되는지 관심있게 지켜보다가  특정 메서드가 호출되면 자동으로 전과 후에 다른 메서드가 호출 될 수 있도록 한다.



## Spring AOP 용어

### Joint Poin : 모듈이 삽입되어 동작하게 되는 특정 위치(메서드 호출 등)

### Point Cut : 다양한 Joint Point 중에 어떤 것을 사용할지 선택

### Advice : Joint Point 에 삽입되어 동작할 수 있는 코드

### Weaving : Advice를 핵심 로직 코드에 적용하는 것

### Aspect : PointCut + Advice



## Spring AOP Advice 종류

### before : 메서드 호출 전에 동작하는 Advice

### after-returning : 예외없이 호출된 메서드의 동작이 완료되면 동작하는 Advice

### after-throwing : 호출된 메서드 동작 중 예외가 발생했을 때 동작하는 Advice

### after : 예외 발생 여부에 관계없이 호출된 메서드의 동작이 완료되면 동작하는 Advice

### around : 메서드 호출 전과 후에 동작하는 Advice



## AOP 구현

XML

@AspectJ

