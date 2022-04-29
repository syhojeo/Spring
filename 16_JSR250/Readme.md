# JSR-250
JSR-250 Annotation 에는 @Resource, @PostConstruct, @PreDestroy 3가지 Annotation을 사용할 수 있다

## @PostConstruct, @PreDestroy
생성자 생성 이후, 생성자 소멸 이전에 실행되는 메서드를 설정해준다

## @Resource
Bean에 이름을 통해 주입한다

name 속성의 이름을 기준으로 찾으며 없다면 타입, @Qualifier 순으로 Annotation이 붙은 속성에 의존성을 주입한다

**이름 -> 타입 -> @Qualifier -> 실패**

또한, 특정 프레임 워크에 종속적이지 않는다

field, setter 에 주입할 수 있다 (constructor에는 불가능)

## @PostConstruct vs initMethod
두가지가 동시에 존재할때 @PostConstruct, @PreDestroy 어노테이션의 메서드가 먼저 실행된다는 특징이 있다

나머지는 크게 다르지 않다

## @Resource vs @Autowired
Autowire의 경우 

**타입 -> 이름 -> @Qualifier -> 실패**

순으로 탐색하며 <context:annotation-config/> 구문을 꼭 xml 설정파일에 추가해야한다

field, setter, constructor 에 모두 주입할 수 있다

**정리: @Resource의 경우 name 기준으로 먼저 주입시키며, @Autowired의 경우 type 기준으로 주입시킨다**
**하지만 @Autowired 의 경우 @Qualifier 를 통해 name 기준으로 주입시킬 수 있다**


