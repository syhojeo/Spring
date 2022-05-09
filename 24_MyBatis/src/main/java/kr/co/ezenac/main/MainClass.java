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
//		JdbcBean bean2 = ctx.getBean(JdbcBean.class);
//		bean2.setInt_data(1);
//		bean2.setStr_data("문자열1");
//		mapper.insert_data(bean2);
		
//		JdbcBean bean3 = ctx.getBean(JdbcBean.class);
//		bean2.setInt_data(100);
//		bean2.setStr_data("문자열100");
//		mapper.insert_data(bean2);
		
		//update
//		JdbcBean bean4 = ctx.getBean(JdbcBean.class);
//		bean4.setInt_data(1);
//		bean4.setStr_data("문자열11");
//		mapper.update_data(bean4);
		
		//delete
		mapper.delete_data(1);
		
		
		//select
		List<JdbcBean> list1 = mapper.select_data();
		
		for (JdbcBean bean1 : list1) {
			System.out.printf("int_data : %d\n", bean1.getInt_data());
			System.out.printf("str_data : %s\n", bean1.getStr_data());
			System.out.println("-----------------------------------------");
		}
		
		
		
		ctx.close();
	}
}
