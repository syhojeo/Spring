package kr.co.ezenac.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.ezenac.beans.JdbcBean;
import kr.co.ezenac.config.BeanConfigClass;
import kr.co.ezenac.db.JdbcDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		JdbcDAO dao = ctx.getBean(JdbcDAO.class);
		
//		JdbcBean bean1 = ctx.getBean(JdbcBean.class);
//		bean1.setInt_data(1);
//		bean1.setStr_data("문자열1");
//		dao.insert_data(bean1);
//		
//		JdbcBean bean2 = ctx.getBean(JdbcBean.class);
//		bean2.setInt_data(2);
//		bean2.setStr_data("문자열2");
//		dao.insert_data(bean2);
//		
//		System.out.println("저장완료");
		
		// update
//		JdbcBean bean4 = ctx.getBean(JdbcBean.class);
//		bean4.setInt_data(1);
//		bean4.setStr_data("문자열5");
//		dao.update_data(bean4);
		
		// delete
//		dao.delete_data(2);
		
		// select
		List<JdbcBean> list = dao.select_data();
		
		for (JdbcBean bean3 : list) {
			System.out.printf("int_data : %d\n", bean3.getInt_data());
			System.out.printf("str_data : %s\n", bean3.getStr_data());
			System.out.println("-------------------------------------------");
		}
		
		
		ctx.close();
	}

}
