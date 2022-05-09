package kr.co.ezenac.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.ezenac.mapper.MapperInterface;

@Configuration
@ComponentScan(basePackages={"kr.co.ezenac.beans"})
public class BeanConfigClass {
	
	//DataSource
	@Bean
	public BasicDataSource source() {
		BasicDataSource source=new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("scott");
		source.setPassword("tiger");
		
		return source;
	}
	
	// SqlSessionFactory : jdbc를 처리하는 객체
	// JdbcTemplate 역할 
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		//1. factoryBean 생성
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		//2. Datasource 참조
		factoryBean.setDataSource(source);
		//3. Datasource를 참조한 factoryBean을 가지고 factory 생성
		SqlSessionFactory factory = factoryBean.getObject();
		
		//4. factory 리턴
		return factory;
	}
	
	// Mapper 이용하여 rs 대신 DB값 받아오기
	@Bean
	public MapperFactoryBean<MapperInterface> test_mapper(SqlSessionFactory factory) throws Exception{
		//1. MapperFactoryBean생성
		//MapperFactoryBean에 sql 메서드를 정의한 MapperInterface를 참조하여 factoryBean 생성
		MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		//2. MapperFactoryBean에 이전에 생성한 SqlSessionfactory를 넣는다
		factoryBean.setSqlSessionFactory(factory);
		
		//3. MapperFactoryBean 리턴
		return factoryBean;
	}
}
