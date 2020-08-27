package com.yc.C86S3Ppkblog.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.C86S3Ppkblog.bean.User;
import com.yc.C86S3Ppkblog.dao.UserMapper;

@Service
public class UserBiz {
	
	@Resource
	private UserMapper uMapper;
	
	public void register(User user) throws BizException {
		//同名验证
		if(uMapper.countByAccount(user.getAccount())>0) {
			throw new BizException("用户已经存在！");
		}
		uMapper.insert(user);
	}
	
	public User login(User user) throws BizException {
		User duser = uMapper.selectByLogin(user);
		if(duser==null) {
			throw new BizException("用户名密码错误！");
		}
		return duser;
	}

}
