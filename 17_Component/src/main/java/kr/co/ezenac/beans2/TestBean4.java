package kr.co.ezenac.beans2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("xml300")
//@Component
//Primary를 통해 중복되는 여러가지 같은 타입이 있더라도 우선순위를 지정하여 에러가 나지 않고 
//현재 메서드를 우선하여 사용하게 한다
//@Primary
public class TestBean4 {

}