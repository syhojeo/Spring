package kr.co.ezenac.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 1. MyBatis는 반드시 자바 버전 8.0 이상 이어야한다.
@Component
@Scope("prototype")
public class JdbcBean {
	private int int_data;
	private String str_data;
	
	public int getInt_data() {
		return int_data;
	}
	public void setInt_data(int int_data) {
		this.int_data = int_data;
	}
	public String getStr_data() {
		return str_data;
	}
	public void setStr_data(String str_data) {
		this.str_data = str_data;
	}
	
}
