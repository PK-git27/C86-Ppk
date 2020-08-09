package com.yc.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.spring.dao.UserDao;

public class HelloTest {
	
	@Test
	public void test() {
		
		/**
		 * Spring 框架解决的问题
		 * Servlet
		 * 		UserBiz ubiz = new UserBiz();
		 * 1.new  ==>  创建对象  ==>  内存中创占用储对象的空间
		 * 		每次new都会创建一个新的对象 ==> 内存消耗大
		 * 		解决的方式 使用对象池
		 * 		对象池.get对象 获取对象
		 * 2.耦合性问题
		 * 
		 * 
		 * 
		 */
		
		
		//从soring框架中获取一个hello对象
		//创建spring容器对象
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("beans.xml");
		
		Hello h = (Hello) ctx.getBean("hello");
		
		h.sayHello();
		
		ctx.close();
		
	}
	
	@Test
	public void test1() {
		
		
		//从soring框架中获取一个hello对象
		//创建spring容器对象
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("beans.xml");
		
		UserDao udao1 = (UserDao) ctx.getBean("mdao");
		UserDao udao2 = (UserDao) ctx.getBean("odao");
		
		udao1.selectUserId("zhangsan");
		udao2.selectUserId("zhangsan");
		
		
		ctx.close();
		
	}

}
