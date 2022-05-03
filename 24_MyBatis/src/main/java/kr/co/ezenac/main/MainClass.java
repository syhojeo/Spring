package kr.co.ezenac.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.ezenac.beans.JdbcBean;
import kr.co.ezenac.config.BeanConfigClass;
import kr.co.ezenac.mapper.MapperInterface;

public class MainClass {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MapperInterface mapper = ctx.getBean("test_mapper", MapperInterface.class);
		
		// insert
		JdbcBean bean2 = ctx.getBean(JdbcBean.class);
		bean2.setInt_data(50);
		bean2.setStr_data("문자열50");
		mapper.insert_data(bean2);
		
		JdbcBean bean3 = ctx.getBean(JdbcBean.class);
		bean2.setInt_data(60);
		bean2.setStr_data("문자열60");
		mapper.insert_data(bean2);
		
		List<JdbcBean> list1 = mapper.select_data();
		
		for (JdbcBean bean1 : list1) {
			System.out.printf("int_data : %d\n", bean1.getInt_data());
			System.out.printf("str_data : %s\n", bean1.getStr_data());
			System.out.println("-----------------------------------------");
		}
		
		ctx.close();
	}
}
