package com.yc.crbook;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.yc.crbook.bean.CrShow;
import com.yc.crbook.dao.CrShowMapper;

@SpringBootTest
public class test {
	
	@Resource
	private CrShowMapper csm;
	
	@Test
	public void test() {
		CrShow c = csm.selectByPrimaryKey(1);
		System.out.println(c.getBook());
	}
	

}
