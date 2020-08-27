package com.yc.C86S3PpkSpringBoot.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.C86S3PpkSpringBoot.dao.UserDao;
import com.yc.damai.bean.DmUser;

@Service
public class UserBiz {
	@Resource
	private UserDao ud;

	public DmUser login(String name, String pwd) throws BizException {
		
		DmUser du = ud.selectByLogin(name, pwd);
		if(du == null) {
			throw new BizException("用户名密码错误");
		}
		
		return du;
		
	}
}
