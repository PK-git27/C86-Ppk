package com.yc.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.yc.spring")
@EnableAspectJAutoProxy  // AOP 不是spring提供的概念
public class AOPConfig {
	

}
