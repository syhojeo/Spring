# 어노테이션을 이용한 빈 설정

ApplicationContext 안에 이미 등록된 bean들의 Annotation을 활성화 하기 위해 사용된다.

bean들이 XML로 등록됐는지 혹은 패키지 스캐닝을 통해 등록됐는지는 중요하지 않다.

이미 스프링 컨텍스트에 의해 생성되어 저장된 bean들에 대해서 @Autowired와 @Qualifier Annotation을 인식할 수 있다.

component-scan 또한 같은 일을 할 수 있는데, context:annotation-config는 bean을 등록하는 작업을 하지 않는다.

즉, bean을 등록하기 위해 패키지를 안의 클래스를 스캔할 수 없다.

이 태그를 설정하면 @Required @Autowired @Resource @PostConstruct @PreDestroy @Configuration 기능을 각각 설정하지 않아도 된다.


## [<context:annotation-config>](<context:annotation-config>/)

## @Required : 반드시 주입 해야 할 프로퍼티로 설정한다

Spring 5.1 버전 부터 Deprecated 되었다. 반드시 주입해야할 프로퍼티는 생성자 주입을 이용하도록 변경되었다

## @Autowired

객체 타입을 통해 bean 객체를 자동으로 주입한다

## @Qualifier

@Autowired로 주입시 같은 타입의 Bean이 여러 개 정의되어 있다면Qualifier에 설정되어 있는 bean을 찾아 주입한다

## 생성자 주입

생성자에 주입시 참조 변수 타입 변수들은 자동으로 주입되고 기본 자료형 및 문자열 값만 주입을 설정 해주면된다

스프링의 다양한 어노테이션을 활용해 Bean객체에 대한 설정을 할 수 있다