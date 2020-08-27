package com.yc.C86S3PpkSpringBoot.biz;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import com.yc.C86S3PpkSpringBoot.dao.UserDao;
import com.yc.damai.bean.DmUser;

@SpringBootTest
public class UserBizTest {

	@MockBean
	private UserDao udao;
	
	@Resource
	private UserBiz ubiz;
	
	@Test
	public void testLogin() {
		try {
			//模拟的结果对象
			DmUser dbret = new DmUser();
			//模拟对象方法调用结果
			Mockito.when(udao.selectByLogin("武松", "123")).thenReturn(dbret);
			DmUser user = ubiz.login("武松", "123");
			Assert.isTrue(user !=null,"没查到指定用户");
			System.out.println("测试完成");
			
		}catch(BizException e) {
			Assert.isTrue(e==null,"dao类异常");
			e.printStackTrace();
		}
	}
	
}
