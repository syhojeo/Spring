# MyBatis

Spring Framework 에서 제공하는 JDBC 라이브러리를 보다 쉽게 작업할 수 있도록 만든 라이브러리

Mapper의 역활을 확장하여 쿼리문 작성을 모두 Mapper에서 할 수 있도록 지원한다

Spring Framework 의 대표적인 라이브러리다

## Spring MyBatis 사용 구조

1. DataSource 를 사용하여 접근할 DB정보 입력

2. SqlSessionFactory 를 이용하여 DB에 연동한다

3. DB에 접근하여 사용될 sql 메서드들을 MapperInterface에 정의한다

4. MapperFactoryBean를 사용하기 위해 3번에서 설정한 MapperInterface 클래스를 넣어 MapperFactoryBean을 생성하고,
생성된 MapperFactoryBean에 이전에 연동한 SqlSessionFactory(factory)값을 넣어 DB를 사용할 준비를 마친다
5. Main에서 MapperFactoryBean을 MapperInterface 타입으로 getBean 하여 사용한다 (DTO 로 JDBCBean 객체를 사용해야한다)
