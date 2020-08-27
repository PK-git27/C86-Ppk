package com.yc.C86S3PpkSpringBoot;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.yc.C86S3PpkSpringBoot.biz.MailService;
import com.yc.C86S3PpkSpringBoot.dao.ProductMapper;

@SpringBootTest
class C86S3PpkSpringBootApplicationTests {

	@Resource
	ProductMapper pm;
	@Resource
	MailService ms;
	
	@Test
	void contextLoads() {
		Assert.isTrue(pm.selectAll().size()>0, "没有数据");
	}
	
	@Test
	void textMail() {
		ms.sendSimpleMail("844160936@qq.com", "密码重置验证码", "您重置密码的验证码是:123456");
	}
	
	
	

}
