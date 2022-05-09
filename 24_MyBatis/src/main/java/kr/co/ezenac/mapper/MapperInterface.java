package kr.co.ezenac.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.ezenac.beans.JdbcBean;

//MyBatis 에서는 DAO 대신 MapperInterface를 사용하여
//sql 사용 메서드를 정의한다
public interface MapperInterface {
	
	// 데이터 컬럼의 값을 빈의 어디에 넣을 것인가 지정
	// Database의 column 이 "int_data" 라면, property="int_data" 에 값을 넣기
	@Results({
		@Result(column="int_data", property="int_data"),
		@Result(column="str_data", property="str_data")
		})
	
	// 추상메서드
	@Select("select int_data, str_data from jdbc_table")
	List<JdbcBean> select_data();
	
	@Insert("insert into jdbc_table (int_data, str_data) values(#{int_data}, #{str_data})")
	void insert_data(JdbcBean bean);
	
	@Update("update jdbc_table set str_data=#{str_data} where int_data=#{int_data}")
	void update_data(JdbcBean bean);
	
	@Delete("delete from jdbc_table where int_data=#{int_data}")
	void delete_data(int int_data);
}
