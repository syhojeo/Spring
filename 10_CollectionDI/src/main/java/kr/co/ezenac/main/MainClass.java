package kr.co.ezenac.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezenac.beans.DataBean;
import kr.co.ezenac.beans.TestBean;

public class MainClass {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		
		//List 컬렉션
		List<String> list1 = t1.getList1();
		for (String str : list1) {
			System.out.printf("list1 : %s\n", str);
		}
		List<Integer> list2 = t1.getList2();
		for (Integer num : list2) {
			System.out.printf("list2 : %d\n", num);
		}
		List<DataBean> list3 = t1.getList3();
		for (DataBean data : list3) {
			System.out.printf("list3 : %s\n", data);
		}
		
		//Set 컬렉션
		Set<String> set1 = t1.getSet1();
//		Iterator<String> iterator1 = set1.iterator();
//		while (iterator1.hasNext()) {
//			String str = iterator1.next();
//			System.out.println(str);
//		}
		
		Set<Integer> set2 = t1.getSet2();
//		Iterator<Integer> iterator2 = set2.iterator();
//		while (iterator2.hasNext()) {
//			int num = iterator2.next();
//			System.out.println(num);
//		}
		
		Set<DataBean> set3 = t1.getSet3();
//		Iterator<DataBean> iterator3 = set3.iterator();
//		while (iterator3.hasNext()) {
//			DataBean obj = iterator3.next();
//			System.out.println(obj);
//		}
		
		for (String str : set1) {
			System.out.printf("set1 : %s\n", str);
		}
		
		for (int num : set2) {
			System.out.printf("set1 : %d\n", num);
		}
		
		for (DataBean obj : set3) {
			System.out.printf("set1 : %s\n", obj);
		}
		System.out.println("------------------------------");
		
		//map 컬렉션 
		//value 값이 Object이기 때문에 캐스팅이 필요하다
		Map<String, Object> map1 = t1.getMap1();
		
		String a1 = (String)map1.get("a1");
		System.out.printf("a1 : %s\n", a1);
		
		Integer a2 = (Integer)map1.get("a2");
		System.out.printf("a2 : %s\n", a2);
		
		DataBean a3 = (DataBean)map1.get("a3");
		System.out.printf("a3 : %s\n", a3);
		
		Object a4 = (DataBean)map1.get("a4");
		System.out.printf("a4 : %s\n", a4);
		
		List<String> a5 = (List<String>)map1.get("a5");
		for (String str : a5) {
			System.out.printf("a5 : %s\n",str);
		}
		
		//properties 컬렉션
		//map 과 동일하지만 key, value 모두 String을 가지는 컬렉션
		//map 과 같이 get으로 value을 얻으려하면 String 형변환이 필요하기 때문에
		//get 이 아닌 getProperty로 받아줘야한다
		Properties prop = t1.getProp1();
		
//		String p1 = (String)prop.get("p1");
//		System.out.printf("p1: %s\n", p1);
		
		String p1 = prop.getProperty("p1");
		System.out.printf("p1: %s\n", p1);
		
		String p2 = prop.getProperty("p2");
		System.out.printf("p2: %s\n", p2);
		
		String p3 = prop.getProperty("p3");
		System.out.printf("p3: %s\n", p3);
		ctx.close();
	}
	
}
