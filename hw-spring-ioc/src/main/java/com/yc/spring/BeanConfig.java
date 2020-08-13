package com.yc.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.yc.spring.bank.bean.Account;
import com.yc.spring.bbs.bean.User;


/**
 * 注释方法配置IOC容器
 * @author pk
 *
 */
@Configuration    //IOC容器配置类的注释  ==> beans.xml
public class BeanConfig {
	
	@Bean("account")
	public Account a() {
		return new Account();
	}
	
	@Bean("account1")
	@Scope(value = "prototype")
	public Account b() {
		return new Account();
	}
	
	@Bean(name = "account2" )
	public Account c() {
		return Account.getInstance();
	}
	
	@Bean(name = "account3")
	public Account d() {
		return Account.getInstance();
	}
	
	@Bean(name = "account4")
	@Scope("prototype")
	public Account e() {
		return Account.getAccount();
	}
	
	@Bean("myUser")
	public User u() {
		User u = new User();
		u.setUname("武松");
		u.setUpass("abc123");
		u.setHead("20.gif");
		u.setGender(1);
		
		return u;
	}

}
