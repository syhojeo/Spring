package kr.co.ezenac.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import kr.co.ezenac.beans.JdbcBean;

public interface MapperInterface {
	
	// 데이터 컬럼의 값을 빈의 어디에 넣을 것인가 지정
//	@Results({
//		@Result(column="int_data", property="int_data"),
//		@Result(column="str_data", property="str_data")
//		})
	
	// 추상메서드
	@Select("select int_data, str_data from jdbc_table")
	List<JdbcBean> select_data();
	
	@Insert("insert into jdbc_table (int_data, str_data) values(#{int_data}, #{str_data})")
	void insert_data(JdbcBean bean);
}
