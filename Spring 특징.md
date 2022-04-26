# 특징

# IOC 기반의 framework

# IOC (Inversion of Control)

모든 작업을 사용자가 제어하는 것과 다르게 제어의 흐름을 프레임 워크에 위임하는 것을 말한다

일반적인 사용자의 객체 결정, 생성 → 의존성 객체 생성 → 객체 내의 메소드사용 등의 제어를 특별한 객체에게 위힘한다

# DL , DI

IOC는 DL과 DI 에 의해 구현된다

의존성 : 하나의 객체가 어떠한 다른 객체를 사용하고 있음을 의미한다

## DL (Dependency Lookup) - 의존성 검색

의존대상을 bean 검색을 통해 반환받는것

bean: 자주 사용하는 객체를 singleton 객체로 생성해놓고 어디서든 불러서 쑬 수 있게한다

## DI (Dependency Injection) - 의존성 주입

의존대상을 주입을 통해 받는 형식

각 클래스 사이에 필요로 하는 의존 관계를 bean 정보를 바탕으로 컨테이너가 자동으로 연결해준다

## POJO (Plain Old Java Object)

평범한 자바 오브젝트

이전에 사용하던 EJB는 한가지 기능을 위해 불필요한 복잡한 로직이 과도하게 들어가게 되었는데 이 때문에

getter/setter를 가진 단순 자바 오브젝트를 사용한다

## AOP (Aspect Oriented Programming)

관점 지향 프로그래밍

객체 지향형의 OOP의 경우 지나친 독립성으로 인해 중복된 코드들이 많아지고, 가독성, 확장성, 유지보수성을 떨어뜨리는 단점을 가진다

이를 극복하기 위해서 나온것이 AOP 관점지향 프로그래밍이다

AOP는 핵심 기능과 공통기능을 분리시켜 핵심 로직에 영향을 끼치지 않고 공통기능을 끼워넣는 개발 형태를 가진다

**이를 통해 무분별하게 중복되는 코드를 한곳에 모아(공통기능) 중복되는 코드를 제거하고, 공통기능 하나의 수정으로 모든 핵심 기능들의 공통 기능을 수정할 수 있어 효율적인 유지보수가 가능해지며 재활용성이 극대화 된다**

## MVC (model2)

![1](https://github.com/syhojeo/Spring/image/1.png)

MVC (Model View Controller)

사용자 인터페이스와 비지니스 로직을 분리하여 개발하는 것

### model

데이터 처리를 담당하는 부분

Service 영역과 DAO 영역으로 나누어지게된다

### service 영억

1. 불필요하게 HTTP 통신을 해선 안된다
2. request나 response와 같은 객체를 매개변수로 받아선 안된다
3. View 부분에 대해 종속적인 부분이 없어야 하며 View 부분이 변경되더라도 Service부분은 그대로 재사용할 수 있어야 한다

### View

https://khj93.tistory.com/entry/Spring-Spring-Framework란-기본-개념-핵심-정리