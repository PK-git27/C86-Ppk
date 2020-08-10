package com.yc.spring;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.spring.bean.Person;
import com.yc.spring.dao.UserDao;

public class HelloTest {
	
	private ClassPathXmlApplicationContext ctx;
	
	@Before
	public void before() {
		ctx =
				new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@After
	public void after() {
		ctx.close();
	}
	
	
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
	
	
	@Test
	public void test2() {
		Person p1 = (Person) ctx.getBean("p1");
		Assert.assertEquals("武松",p1.getName());
		Assert.assertEquals(35,p1.getAge());
		Assert.assertEquals(5,p1.getKilleds().size());
		Assert.assertEquals("老虎",p1.getKilleds().get(2));
		
	}
	
	@Test
	public void test3() {
		Person p2 = ctx.getBean(Person.class);
		Assert.assertEquals("李逵",p2.getName());
		Assert.assertEquals(33,p2.getAge());
		Assert.assertEquals("黑旋风",p2.getAlisa());
		
	}
	
	@Test
	public void test4() {
		Person p = (Person) ctx.getBean("p2");
		Assert.assertEquals("吴用",p.getName());
		Assert.assertEquals(38,p.getAge());
		Assert.assertEquals("花荣",p.getFriend().getName());
	}
	
	@Test
	public void test5() {
		Person p = (Person) ctx.getBean("p4");
		Assert.assertEquals("王英",p.getName());
		Assert.assertEquals(30,p.getAge());
	}

	@Test
	public void test6() {
		Person p = (Person) ctx.getBean("p5");
		Assert.assertEquals("故三娘",p.getName());
		Assert.assertEquals(20,p.getAge());
	}
}
