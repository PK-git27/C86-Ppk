package com.yc.crbook;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.yc.crbook.bean.CrUser;
import com.yc.crbook.bean.CrUserExample;
import com.yc.crbook.dao.CrUserMapper;


@SpringBootTest
public class ApplicationTest {
	
	@Resource
	CrUserMapper uMapper;
	
	@Test
	void contextLoads() {
		CrUserExample ue = new CrUserExample();
		// == where account = 'zhang san'
		ue.createCriteria()
		.andAccountEqualTo("admin")
		.andPwdEqualTo("111");
		
		List<CrUser> list = uMapper.selectByExample(ue);
		
		Assert.assertEquals(1, list.size());
		
		
		
	}

}
