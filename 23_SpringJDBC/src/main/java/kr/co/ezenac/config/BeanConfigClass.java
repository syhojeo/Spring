package kr.co.ezenac.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages= {"kr.co.ezenac.beans", "kr.co.ezenac.db"})
public class BeanConfigClass {
	
	//DataSource
	//접근할 데이터베이스의 정보를 넣어준다
	@Bean
	public BasicDataSource source() {
		BasicDataSource source=new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("scott");
		source.setPassword("tiger");
		
		return source;
	}
	
	// JdbcTemplate 를 이용하여 데이터베이스에 접속해서 쿼리를 전달하는 빈을 등록한다
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db = new JdbcTemplate(source);
		
		return db;
	}
}
