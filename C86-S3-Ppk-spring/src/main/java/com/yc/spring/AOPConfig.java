package com.yc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.yc.spring.bean.Person;

@Configuration
@ComponentScan("com.yc.spring")
@EnableAspectJAutoProxy  // AOP 不是spring提供的概念
public class AOPConfig {
	
	@Bean
	public Person getPerson() {
		return new Person();
	}
	
	@Bean
	public Hello getHello() {
		return new Hello();
	}

}
