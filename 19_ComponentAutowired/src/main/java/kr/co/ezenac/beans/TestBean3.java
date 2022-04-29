package kr.co.ezenac.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean3 {
	private int data1;
	private String data2;
	private DataBean4 data3;
	private DataBean5 data4;
	
	//@Component를 사용하면 생성자의 타입을 보고 자동으로 Bean에서 찾아서 넣어준다 
	//(Spring 5.1 부터는 @Required를 쓰지않고 Component나 Autowired를 통해 생성자 값을 넣어준다)
	public TestBean3(@Value("100") int data1, @Value("문자열") String data2, DataBean4 data3, DataBean5 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public DataBean4 getData3() {
		return data3;
	}

	public void setData3(DataBean4 data3) {
		this.data3 = data3;
	}

	public DataBean5 getData4() {
		return data4;
	}

	public void setData4(DataBean5 data4) {
		this.data4 = data4;
	}
	
	
}
