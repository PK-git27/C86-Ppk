package com.yc.spring.dao;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.yc.spring.Hello;
import com.yc.spring.bean.Person;

/**
 * 注释方法配置IOC容器
 * @author pk
 *
 */
@Configuration    //IOC容器配置类的注释  ==> beans.xml
public class BeanConfig {
	
	//xml中的每一个bean 对应java的一个方法, 这个方法返回bean对象
	@Bean(name="odao")
	public OracleUserDao getOracleUserDao() {
		
		return new OracleUserDao();
	}
	
	@Bean(name="mdao")
	public MySQLUserDao getMySQLUserDao() {
		
		return new MySQLUserDao();
	}
	
	@Bean(name="hello")
	public Hello getHello() {
		
		return new Hello();
	}
	
	@Bean(name="p1")
	public Person getPerson1() {
		
		Person ret = new Person();
		ret.setAge(35);
		ret.setName("武松");
		ret.setKilleds(new ArrayList<String>());
		ret.getKilleds().add("西门庆");
		ret.getKilleds().add("西门庆");
		ret.getKilleds().add("老虎");
		ret.getKilleds().add("西门庆");
		ret.getKilleds().add("西门庆");
		return ret;
	}
	
	@Bean(name="p2")
	public Person getPerson2() {
		
		Person ret = new Person();
		Person friend = new Person();
		friend.setName("花荣");
		ret.setAge(38);
		ret.setName("吴用");
		ret.setFriend(friend);
		return ret;
	}
	
	
	@Bean(name="p4")
	public Person getPerson4() {
		Person p = Person.PersonFactory();
		p.setName("王英");
		return  p;
	}
	
	@Bean(name="p5")
	public Person getPerson5() {
		Person p = new Person().PersonFactory1();
		p.setName("故三娘");
		return  p;
	}
	
	/**
	 * 原型模式
	 * @return
	 */
	@Bean(name="hello1")
	@Scope(value="prototype")  //对应<bean scope="prototype">
	public Hello getHello1() {
		return new Hello();
	}
	
	@Bean(name="hello2")
	@Lazy  //对应<bean lazy-init="true">
	public Hello getHello2() {
		return new Hello();
	}
	
	@Bean(name="hello3",initMethod = "init",destroyMethod = "destroy")
	public Hello getHello3() {
		return new Hello();
	}

}
