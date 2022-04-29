package kr.co.ezenac.beans2;

import org.springframework.stereotype.Component;

// Bean으로 등록한다
// 이름이 없기 때문에 타입을 통해서 받아낼 수 있다. beans.xml에서 타입만 정의한 것과 같음
// 하나의 타입을 가지고 중복하지 않고, 이름없이 사용할 경우 편리
// xml에서 Component-scan을 통해 찾아서 자동으로 bean에서 사용한다
@Component
public class TestBean3 {

}
