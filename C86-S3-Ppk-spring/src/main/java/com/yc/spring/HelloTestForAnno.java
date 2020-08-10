package com.yc.spring;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yc.spring.bean.Person;
import com.yc.spring.dao.BeanConfig;
import com.yc.spring.dao.UserDao;

public class HelloTestForAnno {
	
	private AnnotationConfigApplicationContext ctx;
	
	@Before
	public void before() {
		ctx =
				new AnnotationConfigApplicationContext(BeanConfig.class);
	}
	
	@After
	public void after() {
		ctx.close();
	}
	
	
	@Test
	public void test() {
		
		Hello h = (Hello) ctx.getBean("hello");
		
		h.sayHello();
		
		ctx.close();
		
	}
	
	@Test
	public void test1() {
		
		
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
	
	/**
	 * bean 的作用域
	 */
	@Test
	public void test7() {
		System.out.println("================test7====================");
		Hello h0 = (Hello)ctx.getBean("hello");
		Hello h0_1 = (Hello)ctx.getBean("hello");
		Hello h0_2 = (Hello)ctx.getBean("hello");
		Hello h1 = (Hello)ctx.getBean("hello1");
		Hello h1_1 = (Hello)ctx.getBean("hello1");
		Hello h1_2 = (Hello)ctx.getBean("hello1");
		
		System.out.println(h0_1==h0_2);
		System.out.println(h0==h1);
		System.out.println(h1_1==h1_2);
		
	}
	
	/**
	 * 懒加载
	 */
	@Test
	public void test8() {
		System.out.println("================test8====================");
		Hello h0 = (Hello)ctx.getBean("hello2");
		h0.sayHello();
		
	}
	/**
	 * 生命周期
	 */
	@Test
	public void test9() {
		Hello h0 = (Hello)ctx.getBean("hello3");
		h0.sayHello();
		
	}
	/**
	 * 自动装载
	 */
	@Test
	public void test10() {
		Person p = (Person)ctx.getBean("p7");
		
		Assert.assertEquals("鲁智深",p.getFriend().getName());
		
	}

}
