package kr.co.ezenac.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.ezenac.beans.JdbcBean;

@Component
public class MapperClass implements RowMapper<JdbcBean>{
	
	//ResultSet에서 한 행의 데이터를 읽어와 자바 객체로 변환하는 매퍼 기능을 구현한다
	//SQLException에 대해서는 mapRow 메서드를 호출한 곳에서 처리하도록 한다
	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		//JdbcBean : 값을 담을곳
		JdbcBean bean = new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}
}
