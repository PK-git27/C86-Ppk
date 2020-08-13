package com.yc.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yc.spring.bmi.BmiFilter;
import com.yc.spring.bmi.Container;
import com.yc.spring.bmi.Filter;
import com.yc.spring.bmi.Person;

@Configuration 
@ComponentScan("com.yc.spring.bmi")
public class BmiBeanConfig {

	@Autowired
	@Qualifier("ctn")
	private Container ctn;
	
	@Bean
	public Filter getFilter() {
		BmiFilter bf = new BmiFilter();
		//设置身高和体重的最大值最小值
		bf.setMaxHeight(200);
		bf.setMaxWeight(80);
		bf.setMinHeight(15);
		bf.setMinWeight(6);
		return bf; 
	}
	
	
	@Bean
	public Container getContainer() throws Exception {
		Person p0 = new Person();
		p0.setName("宋江");
		p0.setHeight(178);
		p0.setWeight(70);
		Person p1 = new Person();
		p1.setName("燕青");
		p1.setHeight(116);
		p1.setWeight(50);
		Person p2 = new Person();
		p2.setName("武松");
		p2.setHeight(150);
		p2.setWeight(60);
		ctn.add(p0);
		ctn.add(p1);
		ctn.add(p2);
		ctn.add(p2);
		ctn.add(p2);
		ctn.add(p2);
		ctn.add(p2);
		ctn.add(p2);
		ctn.add(p2);
		ctn.add(p2);
		ctn.add(p2);
		ctn.add(p2);
		
		ctn.measure();
		return ctn;
	}
}
