# SpringJDBC
Spring Framework는 JDBC 프로그래밍을 위해 JdbcTemplate 클래스를 제공
JdbcTemplate 클래스는 SQL 쿼리문을 손쉽게 구현할 수 있도록 구현되어 있다.

## Mapper 클래스 
select로 데이터를 가져올 때 어떤 컬럼의 값을 bean 어디에 주입할 것인지 결정을 해줘야 하는데
이 역활을 하는 클래스를 Mapper 클래스라고 부른다.

## JdbcTemplate
https://jaehoney.tistory.com/34


## SpringJDBC 사용 구조
1. DataSource 를 통해 데이터 베이스 정보 입력

2. JdbcTemplate 를 통해 db 접근

3. DB에 접근하여 사용될 sql 메서드들을 DAO에 정의한다

4. db.update와 db.query 를 통해 sql 문 실행 
(db.query 를 통해 select 할 경우 MapperClass 를 이용해 값을 가져온다 -> ResultSet이 Mapper 클래스에 들어가 있다.)
5. main 에서 DAO 객체를 통해 set메서드를 통해 Bean에 값을 넣고, db 관련된 메서드에 bean을 매개변수로 넣어서 사용