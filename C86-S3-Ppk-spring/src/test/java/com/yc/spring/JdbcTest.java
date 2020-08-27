package com.yc.spring;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.yc.spring.bank.biz.Bankbiz;
import com.yc.spring.bank.biz.BizException;

@RunWith(SpringRunner.class)
@ContextConfiguration("/jdbc.xml")
public class JdbcTest {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Resource
	private Bankbiz bbiz;
	
	@Test
	public void test1() {
		jdbcTemplate.update("insert into account values(1,'a',1000)");
	}
	
	@Test
	public void test2() {
		bbiz.register(2, "a", 200);
	}
	
	@Test
	public void test3() throws BizException {
		bbiz.save(1, 1500);
	}
	
	@Test
	public void test4() throws BizException {
		bbiz.save(1, 100);
	}
	
}
