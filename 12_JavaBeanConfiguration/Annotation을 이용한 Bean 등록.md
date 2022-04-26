# Java코드를 활용한 Bean 등록

beans.xml 파일에 등록했던 내용을 java파일에서 작업

## 읽어오는법
AnnotationConfigApplicationContext ctx 
= new AnnotationConfigApplicationContext(BeanConfigClass.class);

BeanConfigClass.class 는 xml을 대신할 자바 파일이다

# 여러가지 Annotation

# @Configuration

현재 자바 파일이 빈 등록을 위한 자바 파일임을 알려 준다

# @Bean

bean 객체를 정의할 때 사용, 메서드의 이름이 bean의 이름이 된다

# @Bean(name=이름)

bean의 이름을 새롭게 정의한다

# @Lazy

lazy-init 속성을 지정한다

# @Scope

bean의 scope를 설정

# @Primary

primary 속성을 지정한다

**@Configuration과 @Bean 어노테이션을 활용해 Bean을 등록한다**