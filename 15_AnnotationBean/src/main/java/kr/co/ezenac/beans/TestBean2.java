package kr.co.ezenac.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/*
	@Component를 쓰지않으면 생성자를 넣을수가 없다
	먼저 TestBean2를 Bean올려야하는데
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	와 같은 코드를 짜버리면 생성자 매개변수가 없는 값을 써야하고
	그렇다고 생성자 매개변수의 타입을 맞춰주자니 Autowired나 @Component 자체의 값 자동 생성자 주입이 불가능해진다
	
	때문에 생성자를 자동 주입하려면 @Component를 통해 생성자 자동주입 + 해당객체 Bean에 저장 하는 방법을 써야한다
 */
public class TestBean2 {
	private int data1;
	private String data2;
	private DataBean3 data3;
	private DataBean4 data4;
	
//	public TestBean2() {
//		
//	}
	
	@Autowired
	public TestBean2(@Value("100")int data1, @Value("문자열")String data2, DataBean3 data3, DataBean4 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}	
	
	public int getData1() {
		return data1;
	}

	public String getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean4 getData4() {
		return data4;
	}
}
